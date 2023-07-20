package com.example.system.controller;

import com.example.system.domain.Event;
import com.example.system.domain.Order;
import com.example.system.service.EventService;
import com.example.system.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
        System.out.println("Creating Order Controller");
    }

    @GetMapping("/system/orders")
    public Iterable<Order> getEvents(){
        return orderService.getAllOrders();
    }

}
