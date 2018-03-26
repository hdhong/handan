package net.pingfang.bean.internal.incoming;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by leohe on 2017/7/8.
 */
public class IncomingBean {
    @JsonProperty(value = "SYSTEM")
    private SystemBean systemBean;

    public SystemBean getSystemBean() {
        return systemBean;
    }

    public void setSystemBean(SystemBean systemBean) {
        this.systemBean = systemBean;
    }
}
