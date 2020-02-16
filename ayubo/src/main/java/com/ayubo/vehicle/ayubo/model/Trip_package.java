package com.ayubo.vehicle.ayubo.model;

import javax.persistence.*;

@Entity
@Table(name = "trip_package")
public class Trip_package {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int p_id;
    @Column
    private String pkg_name;
    @Column
    private int vid;
    @Column
    private int d_id;

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getPkg_name() {
        return pkg_name;
    }

    public void setPkg_name(String pkg_name) {
        this.pkg_name = pkg_name;
    }

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

    @Override
    public String toString() {
        return "Trip_package{" +
                "p_id=" + p_id +
                ", pkg_name='" + pkg_name + '\'' +
                ", vid=" + vid +
                ", d_id=" + d_id +
                '}';
    }
}
