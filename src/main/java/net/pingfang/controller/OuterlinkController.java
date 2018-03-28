package net.pingfang.controller;

import static org.assertj.core.api.Assertions.in;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;

import net.pingfang.webservice.client.TCymJcm;
import net.pingfang.webservice.client.TCymJcmService_Service;

import org.aspectj.weaver.patterns.TypeCategoryTypePattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.pingfang.bean.OutputResultBean;
import net.pingfang.bean.internal.incoming.SystemBean;
import net.pingfang.bean.internal.outgoing.CMDBean;
import net.pingfang.bean.internal.outgoing.ResultBean;
import net.pingfang.service.LinkWithSocket;
import net.pingfang.util.JaxbUtil;
import net.pingfang.util.OutputResultUtil;
import net.pingfang.util.UtilClass;
import net.pingfang.util.UtilConstant;

/**
 * Created by hdhong on 2018/03/27.
 */
@RestController
@Api(tags = "Outerlink", description = "对接服务")
public class OuterlinkController {

	@Value("${cn.yiwu.rfy.station.telegraph.code}")
	private String stationTelegraphCode;
	@Value("${cn.yiwu.rfy.station.tmis.code}")
	private String stationTMISCode;
	@Value("${cn.yiwu.rfy.station.name}")
	private String stationName;
	@Value("${outerlink.outgoing-file.address}")
	private String outgoingFileAddr;
	@Value("${outerlink.incoming-file.address}")
	private String incomingFileAddr;
	@Value("${cn.yiwu.rfy.images.path}")
	private String imagesPath;
	@Autowired
	private LinkWithSocket linkWithSocket;

	@ApiOperation("采集报文")
	@PostMapping("/save")
	public OutputResultBean save(@RequestBody String xmlString) throws IOException {

		// 会话编号
		String sessionId = createSessionId();
		SystemBean input = JaxbUtil.converyToJavaBean(xmlString, SystemBean.class);

		try {
			TCymJcm tCymJcm = convertToOutputMessage(input);
			// 保存发出去的内容
			UtilClass.saveXML(new ObjectMapper().writeValueAsString(tCymJcm), outgoingFileAddr,
					"send-" + input.getChanel() + "-" + sessionId + ".json", UtilConstant.ENCODING_UTF);

			// 发送报文
			String returnString = sendXML(tCymJcm);

			// 保存返回的内容
			UtilClass.saveXML(returnString, incomingFileAddr, "return-" + input.getChanel() + "-" + sessionId + ".json",
					UtilConstant.ENCODING_UTF);

			// 报文转换
			ResultBean resultBean = convertToInputMessage(returnString, input);
			// 向内部服务发消息，用utf-8
			linkWithSocket.sendMessageBySocket(JaxbUtil.convertToXml(resultBean));

		} catch (ParseException e) {
			return OutputResultUtil.error(1, "日期格式出错(" + UtilConstant.DATA_FORMAT_TYPE + ")");
		} catch (DatatypeConfigurationException e) {
			return OutputResultUtil.error(1, "转换XMLGregorianCalendar出错");
		} catch (Exception e) {
			return OutputResultUtil.error(1, "发送WebService出错");
		}

		return OutputResultUtil.success();
	}

	private ResultBean convertToInputMessage(String s, SystemBean input)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Map map = mapper.readValue(s, Map.class);

		List<CMDBean> cmdList = new ArrayList<>();
		CMDBean cmdBean = null;
		CMDBean cmdBeanLED = new CMDBean(UtilConstant.EnumCmdType.LED.name(), UtilConstant.EnumCmdValue.T.name(),
				map.get("msg").toString());
		if (Integer.valueOf(map.get("result").toString()) == 1) {
			cmdBean = new CMDBean(UtilConstant.EnumCmdType.TG.name(), UtilConstant.EnumCmdValue.T.name(), "抬杆");
		} else {
			cmdBean = new CMDBean(UtilConstant.EnumCmdType.TG.name(), UtilConstant.EnumCmdValue.F.name(), "落杆");
		}
		cmdList.add(cmdBean);
		cmdList.add(cmdBeanLED);

		ResultBean resultBean = new ResultBean();
		resultBean.setKey("Gate");
		resultBean.setValue("6");
		resultBean.setArea(input.getArea());
		resultBean.setChanel(input.getChanel());
		resultBean.setIoFlag(input.getIoFlag());
		resultBean.setPassTime(input.getPassTime());
		resultBean.setName("");
		resultBean.setCarNo("");
		resultBean.setCompany("");
		resultBean.setCmdBean(cmdList);
		resultBean.setFilingStaff("");

		return resultBean;
	}

	private String sendXML(TCymJcm tCymJcm) throws Exception, UnknownHostException {
		String addr = InetAddress.getLocalHost().getHostAddress();// 获得本机IP
		TCymJcmService_Service tCymJcmService_service = new TCymJcmService_Service();
		return tCymJcmService_service.getTCymJcmServiceImplPort().save(addr, tCymJcm);
	}

	private TCymJcm convertToOutputMessage(SystemBean input) throws Exception {
		TCymJcm tCymJcm = new TCymJcm();

		tCymJcm.setCzdbm(stationTelegraphCode); // 车站电报码
		tCymJcm.setCztms(stationTMISCode); // 车站TMIS码
		tCymJcm.setCzmc(stationName); // 车站名称
		tCymJcm.setGbzl1(new BigDecimal(input.getWeight())); // 过磅重量1

		if ("I".equals(input.getIoFlag())) {
			tCymJcm.setJcmbz("1"); // 进门
			tCymJcm.setJmcp(input.getRecgBean().getPlate()); // 车牌
			tCymJcm.setJmjzxh1(input.getRecgBean().getContaIdF()); // 集装箱号1
			tCymJcm.setJmjzxh2(input.getRecgBean().getContaIdB()); // 集装箱号2
			tCymJcm.setJmxk1(""); // 箱况1
			tCymJcm.setJmxk2(""); // 箱况2
			tCymJcm.setJmtplj(getImagePath(input.getChanel(), input.getPassTime())); // 图片路径
			tCymJcm.setJmrqsj(
					UtilClass.stringToXMLGregorianCalendar(input.getPassTime(), UtilConstant.DATA_FORMAT_TYPE)); // 日期时间
			tCymJcm.setJmczry(""); // 操作人员
			tCymJcm.setJmcd(input.getChanel()); // 车道

		} else if ("E".equals(input.getIoFlag())) {
			tCymJcm.setJcmbz("0"); // 出门
			tCymJcm.setCmcp(input.getRecgBean().getPlate()); // 车牌
			tCymJcm.setCmjzxh1(input.getRecgBean().getContaIdF()); // 集装箱号1
			tCymJcm.setCmjzxh2(input.getRecgBean().getContaIdB()); // 集装箱号2
			tCymJcm.setCmxk1(""); // 箱况1
			tCymJcm.setCmxk2(""); // 箱况2
			tCymJcm.setCmtplj(getImagePath(input.getChanel(), input.getPassTime())); // 图片路径
			tCymJcm.setCmrqsj(
					UtilClass.stringToXMLGregorianCalendar(input.getPassTime(), UtilConstant.DATA_FORMAT_TYPE)); // 日期时间
			tCymJcm.setCmczry(""); // 操作人员
			tCymJcm.setCmcd(input.getChanel()); // 车道

		}

		return null;
	}

	private String getImagePath(String chanel, String passTime) throws Exception {
		Date d = UtilClass.stringToDate(passTime, UtilConstant.DATA_FORMAT_TYPE);

		String filePath = UtilClass.dateToString(d, "yyyyMMdd");
		String fileName = UtilClass.dateToString(d, "yyyyMMdd-HHmmss");

		List<String> imageSuffix = new ArrayList<>();
		imageSuffix.add("-0.jpg");
		imageSuffix.add("-1.jpg");
		imageSuffix.add("-2-C.jpg");
		imageSuffix.add("-2-R.jpg");
		imageSuffix.add("-3-C.jpg");
		imageSuffix.add("-3-R.jpg");
		imageSuffix.add("-4-C.jpg");
		imageSuffix.add("-4-R.jpg");
		imageSuffix.add("-5-C.jpg");
		imageSuffix.add("-5-R.jpg");
		imageSuffix.add("-6-C.jpg");
		imageSuffix.add("-7-C.jpg");
		imageSuffix.add("-8.jpg");

		StringBuffer sb = new StringBuffer();

		for (String s : imageSuffix) {
			sb.append(",");
			sb.append(imagesPath).append("/");
			sb.append(chanel).append("/");
			sb.append(filePath).append("/");
			sb.append(fileName);
			sb.append("-");
			sb.append(chanel);
			sb.append(s);
		}
		sb.delete(0, 1);
		return sb.toString();
	}

	private String createSessionId() {
		SimpleDateFormat time = new SimpleDateFormat("yyyyMMdd");
		return time.format(new Date()) + "-" + (int) ((Math.random() * 9 + 1) * 10000000);
	}

}
