package com.example.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.withoutxml")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public Coach cricketCoach() {
        return new CricketCoach();
    }
}
