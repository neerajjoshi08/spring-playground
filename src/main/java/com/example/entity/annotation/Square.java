package com.example.entity.annotation;

import org.springframework.stereotype.Component;

@Component("my-square")
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square: drawing...");
    }
}
