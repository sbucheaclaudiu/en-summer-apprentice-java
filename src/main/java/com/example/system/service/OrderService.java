package com.example.system.service;

import com.example.system.domain.Customer;
import com.example.system.domain.Event;
import com.example.system.domain.Order;

import java.util.List;

public interface OrderService {

    Iterable<Order> getAllOrdersByCustomer(Long customerID);

    Order save(Order order);
}
