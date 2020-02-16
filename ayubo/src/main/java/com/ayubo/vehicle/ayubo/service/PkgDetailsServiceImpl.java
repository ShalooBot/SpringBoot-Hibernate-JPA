package com.ayubo.vehicle.ayubo.service;

import com.ayubo.vehicle.ayubo.dao.PkgDetailsDao;
import com.ayubo.vehicle.ayubo.model.Pkg_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PkgDetailsServiceImpl implements PkgDetailsService{

    @Autowired
    private PkgDetailsDao pkgDetailsDao;

    @Transactional
    @Override
    public List<Pkg_details> getAll() {
        return pkgDetailsDao.getAll();
    }

    @Transactional
    @Override
    public void save(Pkg_details pkgDetails) {
        pkgDetailsDao.save(pkgDetails);
    }

    @Transactional
    @Override
    public void delete(int id) {
        pkgDetailsDao.delete(id);
    }
}
