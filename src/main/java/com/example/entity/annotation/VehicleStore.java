package com.example.entity.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VehicleStore {
    @Value("Test-store")
    private String name;
    @Autowired
    @Qualifier("BMW")
    private Vehicle vehicle;

    public void accelerate() {
        vehicle.accelerate();
    }

    @Override
    public String toString() {
        return "VehicleStore{" +
                "name='" + name + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
