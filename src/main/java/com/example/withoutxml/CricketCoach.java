package com.example.withoutxml;

import org.springframework.beans.factory.annotation.Value;

public class CricketCoach implements Coach {
    @Value("${sport.coach.name}")
    private String name;
    @Override
    public void coaching() {
        System.out.println("Cricket coach");
    }

    public String getName() {
        return name;
    }
}
