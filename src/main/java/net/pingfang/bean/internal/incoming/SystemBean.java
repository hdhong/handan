package net.pingfang.bean.internal.incoming;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

/**
 * Created by leohe on 2017/7/6.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SYSTEM")
@XmlType(name = "SYSTEM", propOrder = { "key", "value", "area", "chanel","ioFlag", "passTime", "icBean", "rfIdBean","recgBean", "idCardBean", "weight","scanner", "esealBean", "note" })
public class SystemBean {
    @XmlAttribute(name = "key")
    @JsonProperty(value = "@key")
    private String key;
    @XmlAttribute(name = "value")
    @JsonProperty(value = "@value")
    private String value;
    @XmlElement(name = "Area")
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
    @XmlElement(name = "IC")
    @JsonProperty(value = "IC")
    private IcBean icBean;
    @XmlElement(name = "RFID")
    @JsonProperty(value = "RFID")
    private RFIDBean rfIdBean;
    @XmlElement(name = "RECG")
    @JsonProperty(value = "RECG")
    private RECGBean recgBean;
    @XmlElement(name = "ID_CARD")
    @JsonProperty(value = "ID_CARD")
    private IdCardBean idCardBean;
    @XmlElement(name = "WEIGHT")
    @JsonProperty(value = "WEIGHT")
    private String weight;
    @XmlElement(name = "SCANNER")
    @JsonProperty(value = "SCANNER")
    private String scanner;
    @XmlElement(name = "ESEAL")
    @JsonProperty(value = "ESEAL")
    private EsealBean esealBean;
    @XmlElement(name = "NOTE")
    @JsonProperty(value = "NOTE")
    private String note;

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

    public IcBean getIcBean() {
        return icBean;
    }

    public void setIcBean(IcBean icBean) {
        this.icBean = icBean;
    }

    public RFIDBean getRfIdBean() {
        return rfIdBean;
    }

    public void setRfIdBean(RFIDBean rfIdBean) {
        this.rfIdBean = rfIdBean;
    }

    public RECGBean getRecgBean() {
        return recgBean;
    }

    public void setRecgBean(RECGBean recgBean) {
        this.recgBean = recgBean;
    }

    public IdCardBean getIdCardBean() {
        return idCardBean;
    }

    public void setIdCardBean(IdCardBean idCardBean) {
        this.idCardBean = idCardBean;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getScanner() {
        return scanner;
    }

    public void setScanner(String scanner) {
        this.scanner = scanner;
    }

    public EsealBean getEsealBean() {
        return esealBean;
    }

    public void setEsealBean(EsealBean esealBean) {
        this.esealBean = esealBean;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
