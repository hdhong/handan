package net.pingfang.controller;

import static org.assertj.core.api.Assertions.in;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.pingfang.webservice.client.TCymJcm;
import org.aspectj.weaver.patterns.TypeCategoryTypePattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import net.pingfang.bean.OutputResultBean;
import net.pingfang.bean.internal.incoming.SystemBean;
import net.pingfang.service.LinkWithSocket;
import net.pingfang.util.JaxbUtil;
import net.pingfang.util.UtilClass;
import net.pingfang.util.UtilConstant;

/**
 * Created by hdhong on 2018/03/27.
 */
@RestController
@Api(tags = "Outerlink",description = "对接服务")
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
	
	
	public OutputResultBean save(@RequestBody String xmlString ) {
		
		//会话编号
		String sessionId = createSessionId();
		SystemBean input = JaxbUtil.converyToJavaBean(xmlString, SystemBean.class);
		
		try {
			TCymJcm  cymJcm = convertToOutputMessage(input);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		return null;
	}
	private TCymJcm convertToOutputMessage(SystemBean input) throws Exception {
		TCymJcm  tCymJcm = new TCymJcm();
		
		tCymJcm.setCzdbm(stationTelegraphCode); //车站电报码
		tCymJcm.setCztms(stationTMISCode); //车站TMIS码
		tCymJcm.setCzmc(stationName);  //车站名称
		tCymJcm.setGbzl1(new BigDecimal(input.getWeight())); //过磅重量1
		
		if("I".equals(input.getIoFlag())) {
		      tCymJcm.setJcmbz("1");  //进门
	            tCymJcm.setJmcp(input.getRecgBean().getPlate());  //车牌
	            tCymJcm.setJmjzxh1(input.getRecgBean().getContaIdF());  //集装箱号1
	            tCymJcm.setJmjzxh2(input.getRecgBean().getContaIdB());  //集装箱号2
	            tCymJcm.setJmxk1("");  //箱况1
	            tCymJcm.setJmxk2("");  //箱况2
	            tCymJcm.setJmtplj(getImagePath(input.getChanel(),input.getPassTime()));  //图片路径
	            tCymJcm.setJmrqsj(UtilClass.stringToXMLGregorianCalendar(input.getPassTime(), UtilConstant.DATA_FORMAT_TYPE));  //日期时间
	            tCymJcm.setJmczry("");  //操作人员
	            tCymJcm.setJmcd(input.getChanel());  //车道
	            
		}else if("E".equals(input.getIoFlag())) {
			 tCymJcm.setJcmbz("0");  //出门
	            tCymJcm.setCmcp(input.getRecgBean().getPlate());  //车牌
	            tCymJcm.setCmjzxh1(input.getRecgBean().getContaIdF());  //集装箱号1
	            tCymJcm.setCmjzxh2(input.getRecgBean().getContaIdB());  //集装箱号2
	            tCymJcm.setCmxk1("");  //箱况1
	            tCymJcm.setCmxk2("");  //箱况2
	            tCymJcm.setCmtplj(getImagePath(input.getChanel(),input.getPassTime()));  //图片路径
	            tCymJcm.setCmrqsj(UtilClass.stringToXMLGregorianCalendar(input.getPassTime(), UtilConstant.DATA_FORMAT_TYPE));  //日期时间
	            tCymJcm.setCmczry("");  //操作人员
	            tCymJcm.setCmcd(input.getChanel());  //车道
	            
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
        
        for(String s:imageSuffix) {
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
		return time.format(new Date()) + "-" +(int)((Math.random()*9+1)*10000000);
	}

}
