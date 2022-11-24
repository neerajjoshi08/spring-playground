package com.example.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SportTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SportConfig.class);
        Sport sport = applicationContext.getBean(Cricket.class);
        sport.play();
    }
}
/*
OUTPUT:
Playing cricket...
 */
