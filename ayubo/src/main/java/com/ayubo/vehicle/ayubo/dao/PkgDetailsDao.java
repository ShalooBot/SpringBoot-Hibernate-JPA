package com.ayubo.vehicle.ayubo.dao;

import com.ayubo.vehicle.ayubo.model.Pkg_details;

import java.util.List;

public interface PkgDetailsDao {

    List<Pkg_details> getAll();

    void save(Pkg_details pkgDetails);

    void delete(int id);

}
