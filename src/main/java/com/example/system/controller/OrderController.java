package com.example.system.controller;

import com.example.system.domain.Order;
import com.example.system.domain.OrderDTO;
import com.example.system.service.OrderService;
import com.example.system.service.Service;
import com.example.system.service.ServiceImpl;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/system")
public class OrderController {
    private OrderService orderService;

    private Service service;

    public OrderController(OrderService orderService, Service service) {
        this.orderService = orderService;
        this.service = service;
        System.out.println("Creating Order Controller");
    }

    @GetMapping("/orders")
    public Iterable<Order> getOrdersByCustomer(){
        return orderService.getAllOrdersByCustomer();
    }

    @PostMapping("/orders")
    public Order insert(@RequestBody OrderDTO order){
        return service.saveOrder(order);
    }

}
