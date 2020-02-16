package com.ayubo.vehicle.ayubo.model;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int vid;
    @Column
    private String v_name;
    @Column
    private int chargers_per_vehicle;

    public int getV_id() {
        return vid;
    }

    public void setV_id(int v_id) {
        this.vid = v_id;
    }

    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public int getChargers_per_vehicle() {
        return chargers_per_vehicle;
    }

    public void setChargers_per_vehicle(int chargers_per_vehicle) {
        this.chargers_per_vehicle = chargers_per_vehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vid=" + vid +
                ", v_name='" + v_name + '\'' +
                ", chargers_per_vehicle='" + chargers_per_vehicle + '\'' +
                '}';
    }
}
