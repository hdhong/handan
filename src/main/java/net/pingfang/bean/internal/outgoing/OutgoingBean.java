package net.pingfang.bean.internal.outgoing;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by leohe on 2017/7/12.
 */
public class OutgoingBean {
    @JsonProperty(value = "SYSTEM")
    private ResultBean resultBean;

    public OutgoingBean(ResultBean resultBean) {
        this.resultBean = resultBean;
    }

    public ResultBean getResultBean() {
        return resultBean;
    }

    public void setResultBean(ResultBean resultBean) {
        this.resultBean = resultBean;
    }
}
