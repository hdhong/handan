
package net.pingfang.webservice.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-11-15T18:19:19.449+08:00
 * Generated source version: 3.1.11
 */

@WebFault(name = "Exception", targetNamespace = "http://ywxhc.service.ws.web.yufei.com/")
public class Exception_Exception extends java.lang.Exception {
    
    private net.pingfang.webservice.client.Exception exception;

    public Exception_Exception() {
        super();
    }
    
    public Exception_Exception(String message) {
        super(message);
    }
    
    public Exception_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Exception_Exception(String message, net.pingfang.webservice.client.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public Exception_Exception(String message, net.pingfang.webservice.client.Exception exception, Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public net.pingfang.webservice.client.Exception getFaultInfo() {
        return this.exception;
    }
}