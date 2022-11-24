package com.example.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleStoreTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        VehicleStore vehicleStore = applicationContext.getBean(VehicleStore.class);
        vehicleStore.accelerate();

        System.out.println(vehicleStore);

        Vehicle vehicle1 = applicationContext.getBean(BMW.class);
        Vehicle vehicle2 = applicationContext.getBean(BMW.class);

        boolean isSame = vehicle1 == vehicle2;
        System.out.println("Is vehicle 1 and vehicle 2 are equal " + isSame);
    }
}

/*
OUTPUT:
BMW is accelerating...
VehicleStore{name='vehicle-store-1', vehicle=com.example.annotation.BMW@3012646b}
Is vehicle 1 and vehicle 2 are equal false
 */
