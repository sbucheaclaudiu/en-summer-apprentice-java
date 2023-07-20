package com.example.system.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@jakarta.persistence.Entity
@Table(name = "EventType")
public class EventType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eventTypeID;

    @Column(name = "eventTypeName")
    private String eventTypeName;

    public EventType() {
    }

    public EventType(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public long getEventTypeID() {
        return eventTypeID;
    }

    public void setEventTypeID(long eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    @Override
    public String toString() {
        return "EventType{" +
                "eventTypeID=" + eventTypeID +
                ", eventTypeName='" + eventTypeName + '\'' +
                '}';
    }
}
