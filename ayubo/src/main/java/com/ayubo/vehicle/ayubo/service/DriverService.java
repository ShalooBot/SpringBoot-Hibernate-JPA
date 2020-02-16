package com.ayubo.vehicle.ayubo.service;

import com.ayubo.vehicle.ayubo.model.Driver;

import java.util.List;

public interface DriverService {

    List<Driver> get();

    Driver get(int id);

    void save(Driver drivers);

    void delete(int id);

}
