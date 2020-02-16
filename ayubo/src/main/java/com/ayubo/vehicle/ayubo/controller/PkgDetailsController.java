package com.ayubo.vehicle.ayubo.controller;

import com.ayubo.vehicle.ayubo.model.Pkg_details;
import com.ayubo.vehicle.ayubo.service.PkgDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PkgDetailsController {

    @Autowired
    private PkgDetailsService pkgDetailsService;

    @GetMapping("/pkgs")
    public List<Pkg_details> get() {
        return pkgDetailsService.getAll();
    }

    @PostMapping("/pkgs")
    public Pkg_details save(@RequestBody Pkg_details pkgDetails) {
        pkgDetailsService.save(pkgDetails);
        return pkgDetails;
    }

    @DeleteMapping("/pkgs/{id}")
    public String dlete(@PathVariable int id) {
        pkgDetailsService.delete(id);
        return "Deleted Successfully " + id;
    }

}
