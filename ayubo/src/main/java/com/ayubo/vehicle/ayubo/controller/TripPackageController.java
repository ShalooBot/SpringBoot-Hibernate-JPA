package com.ayubo.vehicle.ayubo.controller;

import com.ayubo.vehicle.ayubo.model.Trip_package;
import com.ayubo.vehicle.ayubo.service.TripPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TripPackageController {

    @Autowired
    private TripPackageService tripPackageService;

    @GetMapping("/trips")
    public List<Trip_package> getAll() {
        return tripPackageService.getAll();
    }

    @GetMapping("/trips/{id}")
    public Trip_package getById(@PathVariable int id) {
        Trip_package trip_package = tripPackageService.getById(id);
        return trip_package;
    }

    @PostMapping("/newtrip")
    public Trip_package save(@RequestBody Trip_package tripPackage) {
        tripPackageService.save(tripPackage);
        return tripPackage;
    }

    @DeleteMapping("/removettrip/{id}")
    public String delete(@PathVariable int id) {
        tripPackageService.delete(id);
        return id + " Successfully deleted";
    }

}
