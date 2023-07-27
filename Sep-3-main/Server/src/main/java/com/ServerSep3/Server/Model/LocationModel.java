package com.ServerSep3.Server.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "location")
public class LocationModel {
    @Column
    private String location;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public LocationModel(String location, int id) {
        this.location = location;
        this.id = id;
    }

    public LocationModel() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
