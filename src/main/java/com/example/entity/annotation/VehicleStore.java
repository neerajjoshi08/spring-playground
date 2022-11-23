package com.example.entity.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleStore {
    private Vehicle vehicle;

    @Autowired
    public VehicleStore(Vehicle vehicle) {
        System.out.println("Constructor called and " + vehicle + " injecte");
        this.vehicle = vehicle;
    }

    public void accelerate() {
        vehicle.accelerate();
    }
}
