package net.pingfang.apspect;

import com.google.gson.Gson;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by leohe on 2017/8/31.
 */
@Aspect
@Component
public class LogAspet {
    private final static Logger LOGGER = LoggerFactory.getLogger(LogAspet.class);
    private Gson gson = new Gson();
    // 方法名
    String methodName;
    long startTime;
    @Pointcut(value = "execution(public * net.pingfang.controller.*.*(..))")
    public void log(){

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){

        methodName = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        startTime = System.currentTimeMillis();

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        LOGGER.info("===============request content===============");
        //url
        LOGGER.info("url={}", request.getRequestURL());
        //method
        LOGGER.info("method={}", request.getMethod());
        //ip
        LOGGER.info("id={}", request.getRemoteAddr());
        //class_method
        LOGGER.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "," + joinPoint.getSignature().getName());
        //args[]
        LOGGER.info("args={}", gson.toJson(joinPoint.getArgs()));
        LOGGER.info("===============request content end===============");

    }


    @AfterReturning(pointcut = "log()",returning = "object")//打印输出结果
    public void doAfterReturing(Object object){
        long E_time = System.currentTimeMillis() - startTime;
        LOGGER.info("===============response content===============");
        LOGGER.info(gson.toJson(object));
        LOGGER.info("---> run " + methodName + " method use：" + E_time + "ms");
        LOGGER.info("===============response content end===============");
    }
}
