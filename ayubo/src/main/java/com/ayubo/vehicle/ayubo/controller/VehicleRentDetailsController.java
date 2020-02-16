package com.ayubo.vehicle.ayubo.controller;

import com.ayubo.vehicle.ayubo.model.Vehicle;
import com.ayubo.vehicle.ayubo.model.VehicleRentDetails;
import com.ayubo.vehicle.ayubo.service.VehicleRentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class VehicleRentDetailsController {

    @Autowired
    private VehicleRentDetailsService vehicleRentDetailsService;

    @GetMapping("/rentdetails")
    public List<VehicleRentDetails> get() {
       return vehicleRentDetailsService.get();
    }
}
