package net.pingfang.util;

import net.pingfang.bean.OutputResultBean;

/**
 * Created by leohe on 2017/9/1.
 */
public class OutputResultUtil {
    /**
     * 返回成功，传入返回体具体出參
     * @param object
     * @return
     */
    public static OutputResultBean success(Object object){
        OutputResultBean result = new OutputResultBean();
        result.setStatus(200);
        result.setMessage("success");
        result.setData(object);
        return result;
    }

    /**
     * 提供给部分不需要出參的接口
     * @return
     */
    public static OutputResultBean success(){
        return success(null);
    }

    /**
     * 自定义错误信息
     * @param code
     * @param message
     * @return
     */
    public static OutputResultBean error(Integer code, String message){
        OutputResultBean result = new OutputResultBean();
        result.setStatus(code);
        result.setMessage(message);
        result.setData(null);
        return result;
    }

    /**
     * 默认错误错误返回
     * @param message
     * @return
     */
    public static OutputResultBean error(String message){
        return error(400,message);
    }

}
