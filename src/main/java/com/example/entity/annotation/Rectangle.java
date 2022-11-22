package com.example.entity.annotation;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle: drawing...");
    }
}
