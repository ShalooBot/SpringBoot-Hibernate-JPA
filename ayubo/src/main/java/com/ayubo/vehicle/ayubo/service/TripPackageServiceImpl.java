package com.ayubo.vehicle.ayubo.service;

import com.ayubo.vehicle.ayubo.dao.TripPackageDao;
import com.ayubo.vehicle.ayubo.model.Trip_package;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TripPackageServiceImpl implements TripPackageService {

    @Autowired
    private TripPackageDao tripPackageDao;

    @Transactional
    @Override
    public List<Trip_package> getAll() {
        return tripPackageDao.getAll();
    }

    @Transactional
    @Override
    public Trip_package getById(int id) {
        return tripPackageDao.getById(id);
    }

    @Transactional
    @Override
    public void save(Trip_package tripPackage) {
        tripPackageDao.save(tripPackage);
    }

    @Transactional
    @Override
    public void delete(int id) {
        tripPackageDao.delete(id);
    }
}
