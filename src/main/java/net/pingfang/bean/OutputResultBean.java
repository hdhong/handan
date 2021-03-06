package net.pingfang.bean;


/*
 * 
 * Created by hedong on 2018/3/26
 */
public class OutputResultBean<T> {
    //状态值：0 极为成功，其他数值代表失败
    private Integer status;
    //错误信息，若status为0时，为success
    private String message;
    // 返回体报文的出参，使用泛型兼容不同的类型
    private T data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
