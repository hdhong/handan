package net.pingfang.util;

/**
 * Created by leohe on 2017/4/14.
 */
public class UtilConstant {

    public static final String ENCODING_UTF = "UTF-8";

    /*
    TG: T 抬杆，F 落杆
    SK: T 收卡，F 吐卡
    LED: T 显示
    GS: T 施封，F 解封
    DY: T 打印，F 清零
    CU: T 重置作业采集流程
     */
    public enum EnumCmdType {
        TG,SK,LED,GS,DY,CU;
    }
    public enum EnumCmdValue {
        T,F;
    }

}
