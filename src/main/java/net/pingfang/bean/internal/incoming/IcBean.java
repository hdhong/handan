package net.pingfang.bean.internal.incoming;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

/**
 * Created by leohe on 2017/7/6.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "IC", propOrder = { "icNo", "icInfo01", "icInfo02", "icInfo03","icInfo04", "icInfo05", "icInfo06", "icInfo07","icInfo08" })
public class IcBean {
    @XmlElement(name = "IC_NO")
    @JsonProperty(value = "IC_NO")
    private String icNo;
    @XmlElement(name = "IC_INFO1")
    @JsonProperty(value = "IC_INFO1")
    private String icInfo01;
    @XmlElement(name="IC_INFO2")
    @JsonProperty(value = "IC_INFO2")
    private String icInfo02;
    @XmlElement(name = "IC_INFO3")
    @JsonProperty(value = "IC_INFO3")
    private String icInfo03;
    @XmlElement(name = "IC_INFO4")
    @JsonProperty(value = "IC_INFO4")
    private String icInfo04;
    @XmlElement(name = "IC_INFO5")
    @JsonProperty(value = "IC_INFO5")
    private String icInfo05;
    @XmlElement(name = "IC_INFO6")
    @JsonProperty(value = "IC_INFO6")
    private String icInfo06;
    @XmlElement(name = "IC_INFO7")
    @JsonProperty(value = "IC_INFO7")
    private String icInfo07;
    @XmlElement(name = "IC_INFO8")
    @JsonProperty(value = "IC_INFO8")
    private String icInfo08;

    public String getIcNo() {
        return icNo;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo;
    }

    public String getIcInfo01() {
        return icInfo01;
    }

    public void setIcInfo01(String icInfo01) {
        this.icInfo01 = icInfo01;
    }

    public String getIcInfo02() {
        return icInfo02;
    }

    public void setIcInfo02(String icInfo02) {
        this.icInfo02 = icInfo02;
    }

    public String getIcInfo03() {
        return icInfo03;
    }

    public void setIcInfo03(String icInfo03) {
        this.icInfo03 = icInfo03;
    }

    public String getIcInfo04() {
        return icInfo04;
    }

    public void setIcInfo04(String icInfo04) {
        this.icInfo04 = icInfo04;
    }

    public String getIcInfo05() {
        return icInfo05;
    }

    public void setIcInfo05(String icInfo05) {
        this.icInfo05 = icInfo05;
    }

    public String getIcInfo06() {
        return icInfo06;
    }

    public void setIcInfo06(String icInfo06) {
        this.icInfo06 = icInfo06;
    }

    public String getIcInfo07() {
        return icInfo07;
    }

    public void setIcInfo07(String icInfo07) {
        this.icInfo07 = icInfo07;
    }

    public String getIcInfo08() {
        return icInfo08;
    }

    public void setIcInfo08(String icInfo08) {
        this.icInfo08 = icInfo08;
    }
}
