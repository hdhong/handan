package net.pingfang.bean.internal.incoming;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

/**
 * Created by leohe on 2017/7/6.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "RECG", propOrder = { "plate", "plateColor", "contaIdF", "contaIsoF","contaCheckF", "contaIdB", "contaIsoB", "contaCheckB" })
public class RECGBean {
    @XmlElement(name = "PLATE")
    @JsonProperty(value = "PLATE")
    private String plate;
    @XmlElement(name = "PLATE_COLOR")
    @JsonProperty(value = "PLATE_COLOR")
    private String plateColor;
    @XmlElement(name="CONTA_ID_F")
    @JsonProperty(value = "CONTA_ID_F")
    private String contaIdF;
    @XmlElement(name = "CONTA_ISO_F")
    @JsonProperty(value = "CONTA_ISO_F")
    private String contaIsoF;
    @XmlElement(name = "CONTA_CHECK_F")
    @JsonProperty(value = "CONTA_CHECK_F")
    private String contaCheckF;
    @XmlElement(name = "CONTA_ID_B")
    @JsonProperty(value = "CONTA_ID_B")
    private String contaIdB;
    @XmlElement(name = "CONTA_ISO_B")
    @JsonProperty(value = "CONTA_ISO_B")
    private String contaIsoB;
    @XmlElement(name = "CONTA_CHECK_B")
    @JsonProperty(value = "CONTA_CHECK_B")
    private String contaCheckB;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(String plateColor) {
        this.plateColor = plateColor;
    }

    public String getContaIdF() {
        return contaIdF;
    }

    public void setContaIdF(String contaIdF) {
        this.contaIdF = contaIdF;
    }

    public String getContaIsoF() {
        return contaIsoF;
    }

    public void setContaIsoF(String contaIsoF) {
        this.contaIsoF = contaIsoF;
    }

    public String getContaCheckF() {
        return contaCheckF;
    }

    public void setContaCheckF(String contaCheckF) {
        this.contaCheckF = contaCheckF;
    }

    public String getContaIdB() {
        return contaIdB;
    }

    public void setContaIdB(String contaIdB) {
        this.contaIdB = contaIdB;
    }

    public String getContaIsoB() {
        return contaIsoB;
    }

    public void setContaIsoB(String contaIsoB) {
        this.contaIsoB = contaIsoB;
    }

    public String getContaCheckB() {
        return contaCheckB;
    }

    public void setContaCheckB(String contaCheckB) {
        this.contaCheckB = contaCheckB;
    }
}
