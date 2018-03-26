package net.pingfang.bean.internal.outgoing;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leohe on 2017/7/7.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SYSTEM")
@XmlType(name = "SYSTEM", propOrder = { "key", "value", "area", "chanel","ioFlag", "passTime", "name", "carNo","company", "cmdBean", "filingStaff" })
public class ResultBean {
    @XmlAttribute(name = "key")
    @JsonProperty(value = "@key")
    private String key;
    @JsonProperty(value = "@value")
    @XmlAttribute(name = "value")
    private String value;
    @XmlElement(name="Area")
    @JsonProperty(value = "Area")
    private String area;
    @XmlElement(name = "Chanel")
    @JsonProperty(value = "Chanel")
    private String chanel;
    @XmlElement(name = "IoFlag")
    @JsonProperty(value = "IoFlag")
    private String ioFlag;
    @XmlElement(name = "Passtime")
    @JsonProperty(value = "Passtime")
    private String passTime;
    @XmlElement(name = "Name")
    @JsonProperty(value = "Name")
    private String name;
    @XmlElement(name = "CarNo")
    @JsonProperty(value = "CarNo")
    private String carNo;
    @XmlElement(name = "Company")
    @JsonProperty(value = "Company")
    private String company;
    @XmlElement(name = "CMD")
    @JsonProperty(value = "CMD")
    private List<CMDBean> cmdBean = new ArrayList<>();
    @XmlElement(name = "FilingStaff")
    @JsonProperty(value = "FilingStaff")
    private String filingStaff;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getChanel() {
        return chanel;
    }

    public void setChanel(String chanel) {
        this.chanel = chanel;
    }

    public String getIoFlag() {
        return ioFlag;
    }

    public void setIoFlag(String ioFlag) {
        this.ioFlag = ioFlag;
    }

    public String getPassTime() {
        return passTime;
    }

    public void setPassTime(String passTime) {
        this.passTime = passTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<CMDBean> getCmdBean() {
        return cmdBean;
    }

    public void setCmdBean(List<CMDBean> cmdBean) {
        this.cmdBean = cmdBean;
    }

    public String getFilingStaff() {
        return filingStaff;
    }

    public void setFilingStaff(String filingStaff) {
        this.filingStaff = filingStaff;
    }
}
