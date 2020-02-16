package com.ayubo.vehicle.ayubo.service;

import com.ayubo.vehicle.ayubo.model.Trip_package;

import java.util.List;

public interface TripPackageService {

    List<Trip_package> getAll();

    Trip_package getById(int id);

    void save(Trip_package tripPackage);

    void delete(int id);

}
