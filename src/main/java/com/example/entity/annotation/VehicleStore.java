package com.example.entity.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleStore {
    @Autowired
    private Vehicle vehicle;

    public void accelerate() {
        vehicle.accelerate();
    }
}
