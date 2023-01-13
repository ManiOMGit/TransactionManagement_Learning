package com.practice.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerImpl {

    @Pointcut("within(com.practice.service.*)")
    public void logMethodPointCut(){

    }
    @Before("logMethodPointCut()")
    public void LogBeforeMethods(){
        System.out.println("********************Logging using AOP*****************************");
    }
}
