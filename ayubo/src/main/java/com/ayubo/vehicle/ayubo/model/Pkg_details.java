package com.ayubo.vehicle.ayubo.model;

import javax.persistence.*;

@Entity
@Table(name = "pkg_details")
public class Pkg_details {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int vid;
    @Column
    private int d_id;
    @Column
    private int p_id;
    @Column
    private int driver_rate;
    @Column
    private int rate_per_km;
    @Column
    private int waiting_charges;
    @Column
    private int extra_charges_per_km;
    @Column
    private int ot_per_time;

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

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getDriver_rate() {
        return driver_rate;
    }

    public void setDriver_rate(int driver_rate) {
        this.driver_rate = driver_rate;
    }

    public int getRate_per_km() {
        return rate_per_km;
    }

    public void setRate_per_km(int rate_per_km) {
        this.rate_per_km = rate_per_km;
    }

    public int getWaiting_charges() {
        return waiting_charges;
    }

    public void setWaiting_charges(int waiting_charges) {
        this.waiting_charges = waiting_charges;
    }

    public int getExtra_charges_per_km() {
        return extra_charges_per_km;
    }

    public void setExtra_charges_per_km(int extra_charges_per_km) {
        this.extra_charges_per_km = extra_charges_per_km;
    }

    public int getOt_per_time() {
        return ot_per_time;
    }

    public void setOt_per_time(int ot_per_time) {
        this.ot_per_time = ot_per_time;
    }

    @Override
    public String toString() {
        return "Pkg_details{" +
                "vid=" + vid +
                ", d_id=" + d_id +
                ", p_id=" + p_id +
                ", driver_rate=" + driver_rate +
                ", rate_per_km=" + rate_per_km +
                ", waiting_charges=" + waiting_charges +
                ", extra_charges_per_km=" + extra_charges_per_km +
                ", ot_per_time=" + ot_per_time +
                '}';
    }
}
