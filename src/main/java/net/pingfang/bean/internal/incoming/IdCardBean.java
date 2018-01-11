package net.pingfang.bean.internal.incoming;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

/**
 * Created by leohe on 2017/7/6.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "IC_CARD", propOrder = { "idNo", "name", "sex", "nation","brithday", "address", "department", "startDate","stopDate" })
public class IdCardBean {
    @XmlElement(name = "ID_NO")
    @JsonProperty(value = "ID_NO")
    private String idNo;
    @XmlElement(name = "NAME")
    @JsonProperty(value = "NAME")
    private String name;
    @XmlElement(name="SEX")
    @JsonProperty(value = "SEX")
    private String sex;
    @XmlElement(name = "NATION")
    @JsonProperty(value = "NATION")
    private String nation;
    @XmlElement(name = "BIRTHDAY")
    @JsonProperty(value = "BIRTHDAY")
    private String brithday;
    @XmlElement(name = "ADDRESS")
    @JsonProperty(value = "ADDRESS")
    private String address;
    @XmlElement(name = "DEPARTMENT")
    @JsonProperty(value = "DEPARTMENT")
    private String department;
    @XmlElement(name = "STARTDATE")
    @JsonProperty(value = "STARTDATE")
    private String startDate;
    @XmlElement(name = "STOPDATE")
    @JsonProperty(value = "STOPDATE")
    private String stopDate;

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStopDate() {
        return stopDate;
    }

    public void setStopDate(String stopDate) {
        this.stopDate = stopDate;
    }
}
