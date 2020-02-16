package com.ayubo.vehicle.ayubo.dao;

import com.ayubo.vehicle.ayubo.model.VehicleRentDetails;
import com.ayubo.vehicle.ayubo.service.VehicleRentDetailsService;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class VehicleRentDetailsDaoImpl implements VehicleRentDetailsDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<VehicleRentDetails> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<VehicleRentDetails> query = currentSession.createQuery("from VehicleRentDetails ", VehicleRentDetails.class);
        List<VehicleRentDetails> list = query.getResultList();
        return list;
    }
}
