package com.ayubo.vehicle.ayubo.service;

import com.ayubo.vehicle.ayubo.model.Pkg_details;

import java.util.List;

public interface PkgDetailsService {

    List<Pkg_details> getAll();

    void save(Pkg_details pkgDetails);

    void delete(int id);

}
