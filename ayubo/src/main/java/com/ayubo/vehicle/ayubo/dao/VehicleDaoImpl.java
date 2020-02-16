package com.ayubo.vehicle.ayubo.dao;

import com.ayubo.vehicle.ayubo.model.Vehicle;
import org.hibernate.Session;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VehicleDaoImpl implements VehicleDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Vehicle> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Vehicle> query = currentSession.createQuery("from Vehicle ", Vehicle.class);
        List<Vehicle> list = query.getResultList();
        return list;
    }

    @Override
    public Vehicle get(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Vehicle vehicle = currentSession.get(Vehicle.class, id);
        return vehicle;
    }

    @Override
    public void save(Vehicle vehicle) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(vehicle);
    }

    @Override
    public void delete(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Vehicle vehicle = currentSession.get(Vehicle.class, id);
        currentSession.delete(vehicle);
    }
}
