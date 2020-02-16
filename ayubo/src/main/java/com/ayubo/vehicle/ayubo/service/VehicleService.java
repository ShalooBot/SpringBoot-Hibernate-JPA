package com.ayubo.vehicle.ayubo.service;

import com.ayubo.vehicle.ayubo.model.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> get();

    Vehicle get(int id);

    void save(Vehicle vehicle);

    void delete(int id);
}
