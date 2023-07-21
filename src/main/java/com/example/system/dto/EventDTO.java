package com.example.system.dto;

import com.example.system.domain.EventType;
import com.example.system.domain.TicketCategory;
import com.example.system.domain.Venue;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class EventDTO implements Serializable {

    private Long eventID;

    private String eventTypeName;

    private Venue venue;

    private String eventName;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String description;

    private List<TicketCategory> ticketCategoryList;

    public EventDTO() {
    }

    public EventDTO(Long eventID, String eventTypeName, Venue venue, String eventName, LocalDateTime startDate, LocalDateTime endDate, String description, List<TicketCategory> ticketCategoryList) {
        this.eventID = eventID;
        this.eventTypeName = eventTypeName;
        this.venue = venue;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.ticketCategoryList = ticketCategoryList;
    }

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
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
        return "EventDTO{" +
                "eventID=" + eventID +
                ", eventTypeName='" + eventTypeName + '\'' +
                ", venue=" + venue +
                ", eventName='" + eventName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", description='" + description + '\'' +
                ", ticketCategoryList=" + ticketCategoryList +
                '}';
    }
}
