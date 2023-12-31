package com.example.system.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Venue")
public class Venue implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long venueID;

    @Column(name = "location")
    private String location;

    @Column(name = "type")
    private String type;

    @Column(name = "capacity")
    private int capacity;

    public Venue() {
    }

    public Venue(String location, String type, int capacity) {
        this.location = location;
        this.type = type;
        this.capacity = capacity;
    }

    public long getVenueID() {
        return venueID;
    }

    public void setVenueID(long venueID) {
        this.venueID = venueID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueID=" + venueID +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
