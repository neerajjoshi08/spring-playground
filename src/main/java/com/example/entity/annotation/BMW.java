package com.example.entity.annotation;

import org.springframework.stereotype.Component;

@Component
public class BMW implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("BMW is accelerating...");
    }
}
