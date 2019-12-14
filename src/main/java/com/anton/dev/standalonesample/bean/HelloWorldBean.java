package com.anton.dev.standalonesample.bean;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldBean {
    public void sayHello(){
        System.out.println("Hello Spring Boot!");
    }
}