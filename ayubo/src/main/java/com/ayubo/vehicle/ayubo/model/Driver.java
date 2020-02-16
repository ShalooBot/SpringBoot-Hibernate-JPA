package com.ayubo.vehicle.ayubo.model;

import javax.persistence.*;

@Entity
@Table(name = "driver")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int d_id;
    @Column
    private String d_name;
    @Column
    private int vid;

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    @Override
    public String toString() {
        return "Drivers{" +
                "d_id=" + d_id +
                ", d_name='" + d_name + '\'' +
                ", vid=" + vid +
                '}';
    }
}
