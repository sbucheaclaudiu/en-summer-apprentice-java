package com.example.system.service;

import com.example.system.domain.Customer;
import com.example.system.domain.Order;
import com.example.system.repository.EventRepo;
import com.example.system.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepo orderRepo;

    private Customer currentCustomer;

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    public void setCurrentCustomer(Customer currentCustomer) {
        this.currentCustomer = currentCustomer;
    }

    @Override
    public Iterable<Order> getAllOrdersByCustomer() {
        return orderRepo.getOrderByCustomer_CustomerID(1L);
    }

    @Override
    public Order insert(Order order) {
        return orderRepo.save(order);
    }

}
