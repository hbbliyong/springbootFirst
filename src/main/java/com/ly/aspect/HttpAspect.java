package com.ly.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/5/14.
 */
@Aspect
@Component
public class HttpAspect {

    private static final Logger logger= LoggerFactory.getLogger(HttpAspect.class);
   //方法1
//    @Before("execution(public * com.ly.controller.HelloController.*(..))")
//    public void log(){
//        System.out.println("222222");
//    }

    //    @After("execution(public * com.ly.controller.HelloController.*(..))")
//    public void doAfter(){
//        System.out.println("222222");
//    }


//改进后的
//方法2，效果是一样的只是，路径不用分开写了
    @Pointcut("execution(public * com.ly.controller.HelloController.*(..))")
    public void log(){
       // System.out.println("222222");
       // logger.info("22222222222");
    }
    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes servletRequestAttributes=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest httpServletRequest=servletRequestAttributes.getRequest();

        // URL
        logger.info("URL={}",httpServletRequest.getRequestURI());
        //method
        logger.info("method={}",httpServletRequest.getMethod());
        //ip
        logger.info("IP={}",httpServletRequest.getRemoteAddr());
        //类方法
        logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        //类参数
        logger.info("args={}",joinPoint.getArgs());

    }
    @After("log()")
    public void doAfter(){
//        System.out.println("doafter2222222");
        logger.info("doafter2222222");
    }

    //返回值
    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object){
        logger.info("response={}",object);
    }
}
