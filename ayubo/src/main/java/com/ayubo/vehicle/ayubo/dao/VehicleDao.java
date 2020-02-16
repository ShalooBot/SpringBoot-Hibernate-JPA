package com.ayubo.vehicle.ayubo.dao;

import com.ayubo.vehicle.ayubo.model.Vehicle;

import java.util.List;

public interface VehicleDao {

    List<Vehicle> get();

    Vehicle get(int id);

    void save(Vehicle vehicle);

    void delete(int id);


}
