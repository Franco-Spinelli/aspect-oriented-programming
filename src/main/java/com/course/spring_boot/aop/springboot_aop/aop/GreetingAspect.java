package com.course.spring_boot.aop.springboot_aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class GreetingAspect {
private Logger logger = LoggerFactory.getLogger(this.getClass());
@Before("execution(String com.course.spring_boot.aop.springboot_aop.services.IGreetingService.sayHello(..))")
public void loggerBefore(JoinPoint joinPoint){
    String method = joinPoint.getSignature().getName();
    String args = Arrays.toString(joinPoint.getArgs());
    logger.info("Before: " + method + "with arguments " + args);
}
}
