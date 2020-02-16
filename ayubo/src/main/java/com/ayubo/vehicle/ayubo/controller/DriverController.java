package com.ayubo.vehicle.ayubo.controller;

import com.ayubo.vehicle.ayubo.model.Driver;
import com.ayubo.vehicle.ayubo.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping("/drivers")
    public List<Driver> get() {
        return driverService.get();
    }

    @GetMapping("/driver/{id}")
    public Driver getbyId(@PathVariable int id) {
        Driver driver = driverService.get(id);
        return driver;
    }

    @PostMapping("/savedrivers")
    public Driver save(@RequestBody Driver driver) {
        driverService.save(driver);
        return driver;
    }

    @DeleteMapping("/driverdelete/{id}")
    public String delete(@PathVariable int id) {
        driverService.delete(id);
        return "Object successfully "+ id + " Deleted";
    }

    @PutMapping("/updatedriver")
    public Driver update(@RequestBody Driver driver) {
        driverService.save(driver);
        return driver;

    }

}
