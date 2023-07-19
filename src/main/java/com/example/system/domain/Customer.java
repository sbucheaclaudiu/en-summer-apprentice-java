package com.example.system.domain;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;

@jakarta.persistence.Entity
@Table(name = "Customer")
public class Customer extends Entity<Long> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerID;

    @Column(name = "customerName")
    private String customerName;

    @Column(name = "email")
    private String email;

    public Customer() {
    }

    public Customer(long customerID, String customerName, String email) {
        super(customerID);
        this.customerID = customerID;
        this.customerName = customerName;
        this.email = email;
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String cusomerName) {
        this.customerName = cusomerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
