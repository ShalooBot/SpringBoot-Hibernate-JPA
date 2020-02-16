package com.ayubo.vehicle.ayubo.dao;

import com.ayubo.vehicle.ayubo.model.Trip_package;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TripPackageDaoImpl implements TripPackageDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Trip_package> getAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Trip_package> query = currentSession.createQuery("from Trip_package", Trip_package.class);
        List<Trip_package> list = query.getResultList();
        return list;
    }

    @Override
    public Trip_package getById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Trip_package trip_package = currentSession.get(Trip_package.class, id);
        return trip_package;
    }

    @Override
    public void save(Trip_package tripPackage) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(tripPackage);
    }

    @Override
    public void delete(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Trip_package trip_package = currentSession.get(Trip_package.class,id);
        currentSession.delete(trip_package);
    }
}
