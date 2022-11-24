package com.example.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BMW implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("BMW is accelerating...");
    }
}
