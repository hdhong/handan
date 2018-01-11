package net.pingfang.bean.internal.incoming;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by leohe on 2017/7/8.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "ESEAL", propOrder = { "esealId", "esealPW" })
public class EsealBean {
    @JsonProperty(value = "ESEAL_ID")
    private String esealId;
    @JsonProperty(value = "ESEAL_PW")
    private String esealPW;

    public String getEsealId() {
        return esealId;
    }

    public void setEsealId(String esealId) {
        this.esealId = esealId;
    }

    public String getEsealPW() {
        return esealPW;
    }

    public void setEsealPW(String esealPW) {
        this.esealPW = esealPW;
    }
}
