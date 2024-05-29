package com.course.spring_boot.aop.springboot_aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class GreetingServicePointcuts {
    @Pointcut("execution(String com.course.spring_boot.aop.springboot_aop.services.IGreetingService.*(..))")
    public void greetingLoggerPointCut(){}

    @Pointcut("execution(String com.course.spring_boot.aop.springboot_aop.services.IGreetingService.*(..))")
    public void greetingFooLoggerAspectPointCut(){}
}
