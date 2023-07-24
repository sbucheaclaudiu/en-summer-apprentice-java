package com.example.system.controller;

import com.example.system.domain.Customer;
import com.example.system.domain.Order;
import com.example.system.domain.OrderBodyPost;
import com.example.system.domain.TicketCategory;
import com.example.system.dto.OrderDTO;
import com.example.system.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/system")
public class OrderController {
    private OrderService orderService;

    private static Long currentCustomerID = 1L;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
        System.out.println("Creating Order Controller");
    }

    @GetMapping("/orders")
    public Iterable<OrderDTO> getOrdersByCustomer(){

        Iterable<OrderDTO> orderList = orderService.getAllOrdersByCustomer(this.currentCustomerID);
        return orderList;
    }


    @PostMapping("/orders")
    public Map<String, OrderDTO> saveOrder(@RequestBody OrderBodyPost order) {
        OrderDTO orderDTO = orderService.save(order, this.currentCustomerID);
        Map<String, OrderDTO> singletonMap = Collections.singletonMap("order", orderDTO);
        return singletonMap;
    }
}
