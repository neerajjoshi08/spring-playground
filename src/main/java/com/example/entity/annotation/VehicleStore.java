package com.example.entity.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleStore {
    @Autowired
    @Qualifier("BMW")
    private Vehicle vehicle;

    public void accelerate() {
        vehicle.accelerate();
    }
}
