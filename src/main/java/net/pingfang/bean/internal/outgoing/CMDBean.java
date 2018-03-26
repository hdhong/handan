package net.pingfang.bean.internal.outgoing;

import javax.xml.bind.annotation.*;

/**
 * Created by leohe on 2017/7/7.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "CMD", propOrder = { "type", "value", "text"})
public class CMDBean {
    @XmlElement(name = "Type")
    private String type;
    @XmlElement(name = "Value")
    private String value;
    @XmlElement(name = "Text")
    private String text;

    public CMDBean() {
    }

    public CMDBean(String type, String value, String text) {
        this.type = type;
        this.value = value;
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
