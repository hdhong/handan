package net.pingfang.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.pingfang.bean.OutputResultBean;
import net.pingfang.bean.external.incoming.GatherFeedbackBean;
import net.pingfang.bean.external.outgoing.GatherInformationBean;
import net.pingfang.bean.internal.incoming.SystemBean;
import net.pingfang.bean.internal.outgoing.CMDBean;
import net.pingfang.bean.internal.outgoing.ResultBean;
import net.pingfang.service.ConnectionService;
import net.pingfang.util.JaxbUtil;
import net.pingfang.util.OutputResultUtil;
import net.pingfang.util.UtilClass;
import net.pingfang.util.UtilConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leohe on 2017/11/16.
 */
@RestController
@Api(tags = "Outerlink",description = "对接服务")
public class OuterlinkController {

    @Value("${message-file.address.outgoing}")
    private String outgoingFileAddr;
    @Value("${message-file.address.incoming}")
    private String incomingFileAddr;
    @Autowired
    private ConnectionService connectionService;

    private ObjectMapper mapper = new ObjectMapper();

    @ApiOperation("采集报文")
    @PostMapping("/gather_information")
    public OutputResultBean save(@RequestBody String xmlString) throws Exception{
        String sessionId = UtilClass.createSessionId();
        //接收内部用报文UTF-8
        SystemBean input = JaxbUtil.converyToJavaBean(xmlString,SystemBean.class);

        GatherInformationBean gatherInfo = setGatherInfo(input,sessionId);
        String jsonString = mapper.writeValueAsString(gatherInfo);
        //保存发出去的报文
        UtilClass.saveXML(jsonString,outgoingFileAddr, input.getChanel() + "-" + sessionId + ".xml", UtilConstant.ENCODING_UTF);
        //发送报文
        String returnString = this.connectionService.sendByRestful(jsonString);
        //保存接收的报文
        UtilClass.saveXML(returnString,incomingFileAddr, input.getChanel() + "-" + sessionId + ".xml", UtilConstant.ENCODING_UTF);

        GatherFeedbackBean gatherFeedback = mapper.readValue(returnString,GatherFeedbackBean.class);
        ResultBean resultBean = setResultBean(gatherFeedback);
        this.connectionService.sendMessageBySocket(JaxbUtil.convertToXml(resultBean));
        return OutputResultUtil.success();
    }

    /**
     * 设置发送报文
     * @param input
     * @param sessionId
     * @return
     */
    private GatherInformationBean setGatherInfo(SystemBean input,String sessionId){
        GatherInformationBean.OcrBean ocrBean = new GatherInformationBean.OcrBean();
        ocrBean.setPlate(input.getRecgBean().getPlate());
        ocrBean.setPlateColor(input.getRecgBean().getPlateColor());
        ocrBean.setContainerCount(checkContainerNumber(input));
        ocrBean.setContainerNumberFront(input.getRecgBean().getContaIdF());
        ocrBean.setContainerIsoFront(input.getRecgBean().getContaIsoF());
        ocrBean.setContainerCheckFront(input.getRecgBean().getContaCheckF());
        ocrBean.setContainerNumberBack(input.getRecgBean().getContaIdB());
        ocrBean.setContainerIsoBack(input.getRecgBean().getContaIsoB());
        ocrBean.setContainerCheckBack(input.getRecgBean().getContaCheckB());

        GatherInformationBean.ImageBean imageBean = new GatherInformationBean.ImageBean();

        GatherInformationBean.GatherInfo gi = new GatherInformationBean.GatherInfo();
        gi.setSessionId(sessionId);
        gi.setAreaId(input.getArea());
        gi.setChannelId(input.getChanel());
        gi.setIeFlag(input.getIoFlag());
        gi.setGatherMode("采集方式");
        gi.setPassTime(input.getPassTime());
        gi.setSendTime(input.getPassTime());
        gi.setOcrBean(ocrBean);
        gi.setImages(imageBean);
        gi.setWeight(input.getWeight());

        GatherInformationBean gatherInformationBean = new GatherInformationBean();
        gatherInformationBean.setGatherInfo(gi);
        return gatherInformationBean;
    }

    /**
     * 检查集装箱数量
     * @param input
     * @return
     */
    private int checkContainerNumber(SystemBean input){
        if (!"".equals(input.getRecgBean().getContaIdF()) && !"".equals(input.getRecgBean().getContaIdB())){
            return 2;
        }else if (!"".equals(input.getRecgBean().getContaIdF()) || !"".equals(input.getRecgBean().getContaIdB())){
            return 1;
        }else {
            return 0;
        }
    }

    /**
     * 报文转换,外部--> 内部
     */
    private ResultBean setResultBean(GatherFeedbackBean gatherFeedbackBean){

        GatherFeedbackBean.FeedbackInfoBean returnInfoBean = gatherFeedbackBean.getFeedbackInfo();
        List<CMDBean> cmdList = new ArrayList<>();
        CMDBean cmdBean = null;
        CMDBean cmdBeanLED = new CMDBean(UtilConstant.EnumCmdType.LED.name(),UtilConstant.EnumCmdValue.T.name(),returnInfoBean.getLedHint());
        if ("Y".equals(returnInfoBean.getCheckResult())){
            cmdBean = new CMDBean(UtilConstant.EnumCmdType.TG.name(),UtilConstant.EnumCmdValue.T.name(),"抬杆");
        }else if ("N".equals(returnInfoBean.getCheckResult())){
            cmdBean = new CMDBean(UtilConstant.EnumCmdType.TG.name(),UtilConstant.EnumCmdValue.F.name(),"落杆");
        }
        cmdList.add(cmdBean);
        cmdList.add(cmdBeanLED);

        ResultBean resultBean = new ResultBean();
        resultBean.setKey("Gate");
        resultBean.setValue("6");
        resultBean.setArea(returnInfoBean.getAreaId());
        resultBean.setChanel(returnInfoBean.getChannelId());
        resultBean.setIoFlag(returnInfoBean.getIeFlag());
        resultBean.setPassTime(returnInfoBean.getFeedbackTime());
        resultBean.setName("");
        resultBean.setCarNo("");
        resultBean.setCompany("");
        resultBean.setCmdBean(cmdList);
        resultBean.setFilingStaff("");

        return resultBean;
    }
}
