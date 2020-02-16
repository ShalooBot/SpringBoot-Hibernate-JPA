package com.ayubo.vehicle.ayubo.service;

import com.ayubo.vehicle.ayubo.dao.VehicleRentDetailsDao;
import com.ayubo.vehicle.ayubo.model.VehicleRentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VehicleRentDetailsServiceImpl implements VehicleRentDetailsService{

    @Autowired
   private VehicleRentDetailsDao vehicleRentDetailsDao;

    @Transactional
    @Override
    public List<VehicleRentDetails> get() {
        return vehicleRentDetailsDao.get();
    }
}
