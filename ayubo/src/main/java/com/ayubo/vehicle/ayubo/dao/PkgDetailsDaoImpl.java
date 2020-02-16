package com.ayubo.vehicle.ayubo.dao;

import com.ayubo.vehicle.ayubo.model.Pkg_details;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PkgDetailsDaoImpl implements PkgDetailsDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Pkg_details> getAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Pkg_details> query = currentSession.createQuery("from Pkg_details", Pkg_details.class);
        List<Pkg_details> list = query.getResultList();
        return list;
    }

    @Override
    public void save(Pkg_details pkgDetails) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(pkgDetails);
    }

    @Override
    public void delete(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Pkg_details pkg_details = currentSession.get(Pkg_details.class, id);
        currentSession.delete(pkg_details);
    }
}
