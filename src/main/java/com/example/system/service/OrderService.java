package com.example.system.service;

import com.example.system.domain.Customer;
import com.example.system.domain.Event;
import com.example.system.domain.Order;
import com.example.system.domain.OrderBodyPost;
import com.example.system.dto.OrderDTO;

import java.util.List;

public interface OrderService {

    Iterable<OrderDTO> getAllOrdersByCustomer(Long customerID);

    OrderDTO save(OrderBodyPost order, Long customerID);
}
