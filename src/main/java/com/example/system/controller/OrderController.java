package com.example.system.controller;

import com.example.system.domain.Event;
import com.example.system.domain.Order;
import com.example.system.service.EventService;
import com.example.system.service.OrderService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/system")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
        System.out.println("Creating Order Controller");
    }

    @GetMapping("/orders")
    public Iterable<Order> getEvents(){
        return orderService.getAllOrders();
    }

}
