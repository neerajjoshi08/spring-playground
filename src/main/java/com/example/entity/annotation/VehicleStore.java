package com.example.entity.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleStore {
    private Vehicle vehicle;

    @Autowired
    public void setVehicle(Vehicle vehicle) {
        System.out.println("Setter called and " + vehicle + " injected.");
        this.vehicle = vehicle;
    }

    public void accelerate() {
        vehicle.accelerate();
    }
}
