package com.ayubo.vehicle.ayubo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_rent_details")
public class VehicleRentDetails {

    @Id
    @Column
    private int vid;
    @Column
    private int d_id;
    @Column
    private String rent_date;
    @Column
    private String return_date;

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getRent_date() {
        return rent_date;
    }

    public void setRent_date(String rent_date) {
        this.rent_date = rent_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    @Override
    public String toString() {
        return "VehicleRentDetails{" +
                "vid=" + vid +
                ", d_id=" + d_id +
                ", rent_date='" + rent_date + '\'' +
                ", return_date='" + return_date + '\'' +
                '}';
    }
}
