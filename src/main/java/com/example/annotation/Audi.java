package com.example.annotation;

import org.springframework.stereotype.Component;

@Component
public class Audi implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Audi accelerating...");
    }
//    @PostConstructor
    public void init() {
        System.out.println("init() method called...");
    }
//    @PreDestroy
    public void destroy() {
        System.out.println("destroy() method called...");
    }
}
