package com.example.entity.annotation;

import org.springframework.stereotype.Component;

@Component
public class Audi implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Audi accelerating...");
    }
}
