package com.ayubo.vehicle.ayubo.controller;


import com.ayubo.vehicle.ayubo.model.Vehicle;
import com.ayubo.vehicle.ayubo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/vehicles")
    public List<Vehicle> get() {
        return vehicleService.get();
    }

    @GetMapping("/vehicle/{id}")
    public Vehicle get(@PathVariable int id) {
        Vehicle vehicle = vehicleService.get(id);
        return vehicle;
    }

    @PutMapping("/updatevehicle")
    public Vehicle save(@RequestBody Vehicle vehicle) {
        vehicleService.save(vehicle);
        return vehicle;
    }

    @DeleteMapping("/removevehicle/{id}")
    public String dlete(@PathVariable int id) {
        vehicleService.delete(id);
        return "Deleted Successfully "+ id;
    }

}
