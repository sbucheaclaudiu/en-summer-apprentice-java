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

    @Override
    public Iterable<Order> getAllOrdersByCustomer(Long customerID) {
        return orderRepo.getOrderByCustomer_CustomerID(customerID);
    }

    @Override
    public Order save(Order order) {
        return orderRepo.save(order);
    }

}
