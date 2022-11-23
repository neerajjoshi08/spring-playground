package com.example.entity.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleStoreTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        VehicleStore vehicleStore = applicationContext.getBean(VehicleStore.class);
        vehicleStore.accelerate();
    }
}

/*
OUTPUT:
BMW is accelerating...
 */
