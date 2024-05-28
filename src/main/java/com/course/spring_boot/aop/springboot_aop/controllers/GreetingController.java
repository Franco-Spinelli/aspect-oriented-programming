package com.course.spring_boot.aop.springboot_aop.controllers;

import com.course.spring_boot.aop.springboot_aop.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;
    @GetMapping("greeting")
    public ResponseEntity<?>greeting(){
        return ResponseEntity.ok(Collections.singletonMap("greeting",greetingService.sayHello("Myke","Nice to meet you")));
    }
}

