package com.ayubo.vehicle.ayubo.service;

import com.ayubo.vehicle.ayubo.dao.DriverDao;
import com.ayubo.vehicle.ayubo.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DriverServiceImpl implements  DriverService {

    @Autowired
    private DriverDao driverDao;

    @Transactional
    @Override
    public List<Driver> get() {
        return driverDao.get();
    }

    @Transactional
    @Override
    public Driver get(int id) {
        return driverDao.get(id);
    }

    @Transactional
    @Override
    public void save(Driver drivers) {
        driverDao.save(drivers);
    }

    @Transactional
    @Override
    public void delete(int id) {
        driverDao.delete(id);
    }
}
