package com.example.withoutxml;

import org.springframework.stereotype.Component;
@Component
public class Cricket implements Sport {
    @Override
    public void play() {
        System.out.println("Playing cricket...");
    }
}
