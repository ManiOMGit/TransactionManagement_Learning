package com.practice.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataSourceAspect {

    @Around("target(javax.sql.DataSource)")
    public Object loadDataSourceConnectionInfo(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("datasource tracker: "+proceedingJoinPoint.getSignature());
       Object returnedvalue=proceedingJoinPoint.proceed();
        System.out.println("****Connection object:***** "+returnedvalue);
       return returnedvalue;
    }
}
