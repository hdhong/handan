package net.pingfang.bean.internal.incoming;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

/**
 * Created by leohe on 2017/7/6.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "RFID", propOrder = { "rfIdId", "rfIdDate" })
public class RFIDBean {
    @XmlElement(name="RFID_ID")
    @JsonProperty(value = "RFID_ID")
    private String rfIdId;
    @XmlElement(name = "RFID_DATA")
    @JsonProperty(value = "RFID_DATA")
    private String rfIdDate;

    public String getRfIdId() {
        return rfIdId;
    }

    public void setRfIdId(String rfIdId) {
        this.rfIdId = rfIdId;
    }

    public String getRfIdDate() {
        return rfIdDate;
    }

    public void setRfIdDate(String rfIdDate) {
        this.rfIdDate = rfIdDate;
    }
}
