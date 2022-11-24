package com.example.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleStoreTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        VehicleStore vehicleStore = applicationContext.getBean(VehicleStore.class);
        vehicleStore.accelerate();

        System.out.println(vehicleStore);
    }
}

/*
OUTPUT:
BMW is accelerating...
VehicleStore{name='vehicle-store-1', vehicle=com.example.entity.annotation.BMW@57250572}
 */
