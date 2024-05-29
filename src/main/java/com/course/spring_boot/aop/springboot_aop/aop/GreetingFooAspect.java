package com.course.spring_boot.aop.springboot_aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Order(1)
@Component
@Aspect
public class GreetingFooAspect {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Before("GreetingServicePointcuts.greetingFooLoggerAspectPointCut()")
    //@Before("execution(String com.course.spring_boot.aop.springboot_aop.services.IGreetingService.*(..))")
    public void loggerBefore(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("Before: " + method + "invoked with the  arguments " + args);
    }
    @After("GreetingServicePointcuts.greetingFooLoggerAspectPointCut()")
    public void loggerAfter(JoinPoint joinPoint){String method = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        logger.info("After: " + method + "Foo with arguments " + args);
    }
}
