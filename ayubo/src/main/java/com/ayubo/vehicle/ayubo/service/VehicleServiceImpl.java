package com.ayubo.vehicle.ayubo.service;

import com.ayubo.vehicle.ayubo.dao.VehicleDao;
import com.ayubo.vehicle.ayubo.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleDao vehicleDao;

    @Transactional
    @Override
    public List<Vehicle> get() {
        return vehicleDao.get();
    }

    @Transactional
    @Override
    public Vehicle get(int id) {
        return vehicleDao.get(id);
    }

    @Transactional
    @Override
    public void save(Vehicle vehicle) {
        vehicleDao.save(vehicle);
    }

    @Transactional
    @Override
    public void delete(int id) {
        vehicleDao.delete(id);
    }
}
