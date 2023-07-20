package com.example.system.domain;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Event")
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventID;

    @ManyToOne
    @JoinColumn(name = "eventTypeID")
    private EventType eventType;

    @ManyToOne
    @JoinColumn(name = "venueID")
    private Venue venue;

    @Column(name = "eventName")
    private String eventName;

    @Column(name = "startDate")
    private LocalDateTime startDate;

    @Column(name = "endDate")
    private LocalDateTime endDate;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "event")
    private List<TicketCategory> ticketCategoryList;

    public Event() {}

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TicketCategory> getTicketCategoryList() {
        return ticketCategoryList;
    }

    public void setTicketCategoryList(List<TicketCategory> ticketCategoryList) {
        this.ticketCategoryList = ticketCategoryList;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID=" + eventID +
                ", eventType=" + eventType +
                ", venue=" + venue +
                ", eventName='" + eventName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", description='" + description + '\'' +
                ", ticketCategoryList=" + ticketCategoryList +
                '}';
    }
}
