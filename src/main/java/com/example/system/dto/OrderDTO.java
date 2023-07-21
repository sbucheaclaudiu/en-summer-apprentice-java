package com.example.system.dto;

import java.time.LocalDateTime;

public class OrderDTO {
    private Long eventID;
    private LocalDateTime orderedAt;
    private Long ticketCategoryID;
    private int numberOfTickets;
    private double totalPrice;

    public OrderDTO() {
    }

    public OrderDTO(Long eventID, LocalDateTime orderedAt, Long ticketCategoryID, int numberOfTickets, double totalPrice) {
        this.eventID = eventID;
        this.orderedAt = orderedAt;
        this.ticketCategoryID = ticketCategoryID;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public Long getEventID() {
        return eventID;
    }

    public void setEventID(Long eventID) {
        this.eventID = eventID;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public Long getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(Long ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "eventID=" + eventID +
                ", orderedAt=" + orderedAt +
                ", ticketCategoryID=" + ticketCategoryID +
                ", numberOfTickets=" + numberOfTickets +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
