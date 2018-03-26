package net.pingfang.bean.internal.incoming;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.xml.txw2.annotation.XmlElement;

/*
 * 
 * Created by hedong on 2018/3/26
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlElement
@XmlType(name = "ESEL",propOrder = {"esealId","esealPW"})
public class EsealBean {
	@JsonProperty(value = "ESEL_ID")
	private String esealId;
	@JsonProperty(value = "ESEAL_PW")
	private String eaealPW;
	public String getEsealId() {
		return esealId;
	}
	public void setEsealId(String esealId) {
		this.esealId = esealId;
	}
	public String getEaealPW() {
		return eaealPW;
	}
	public void setEaealPW(String eaealPW) {
		this.eaealPW = eaealPW;
	}
	
	

}
