package com.course.spring_boot.aop.springboot_aop.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements IGreetingService{
    @Override
    public String sayHello(String person, String phrase) {
        return phrase + " " + person;
    }

    @Override
    public String sayHelloError(String person, String phrase) {
       throw new RuntimeException("Error");
    }
}
