package com.ayubo.vehicle.ayubo.dao;

import com.ayubo.vehicle.ayubo.model.Driver;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class DriverDaoImpl implements DriverDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Driver> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query query = currentSession.createQuery("from Driver", Driver.class);
        List<Driver> list = query.getResultList();
        return list;
    }

    @Override
    public Driver get(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Driver driver = currentSession.get(Driver.class, id);
        return driver;
    }

    @Override
    public void save(Driver drivers) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(drivers);
    }

    @Override
    public void delete(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Driver driver = currentSession.get(Driver.class, id);
        currentSession.delete(driver);
    }
}
