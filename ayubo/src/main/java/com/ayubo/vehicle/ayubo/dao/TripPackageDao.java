package com.ayubo.vehicle.ayubo.dao;

import com.ayubo.vehicle.ayubo.model.Trip_package;

import java.util.List;

public interface TripPackageDao {

    List<Trip_package> getAll();

    Trip_package getById(int id);

    void save(Trip_package tripPackage);

    void delete(int id);

}
