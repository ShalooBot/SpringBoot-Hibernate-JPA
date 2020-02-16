package com.ayubo.vehicle.ayubo.dao;

import com.ayubo.vehicle.ayubo.model.Driver;

import java.util.List;

public interface DriverDao {

    List<Driver> get();

    Driver get(int id);

    void save(Driver drivers);

    void delete(int id);

}
