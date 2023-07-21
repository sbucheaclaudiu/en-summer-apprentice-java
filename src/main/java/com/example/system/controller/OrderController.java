package com.example.system.controller;

import com.example.system.domain.Customer;
import com.example.system.domain.Order;
import com.example.system.domain.OrderBodyPost;
import com.example.system.domain.TicketCategory;
import com.example.system.dto.DTOUtils;
import com.example.system.dto.OrderDTO;
import com.example.system.service.CustomerService;
import com.example.system.service.OrderService;
import com.example.system.service.TicketCategoryService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@CrossOrigin
@RestController
@RequestMapping("/system")
public class OrderController {
    private OrderService orderService;

    private TicketCategoryService ticketCategoryService;

    private CustomerService customerService;

    private Long currentCustomerID;

    public Long getCurrentCustomer() {
        return currentCustomerID;
    }

    public void setCurrentCustomer(Long currentCustomerID) {
        this.currentCustomerID = currentCustomerID;
    }

    public OrderController(OrderService orderService, TicketCategoryService ticketCategoryService, CustomerService customerService) {
        this.orderService = orderService;
        this.ticketCategoryService = ticketCategoryService;
        this.customerService = customerService;
        this.currentCustomerID = 1L;
        System.out.println("Creating Order Controller");
    }

    @GetMapping("/orders")
    public Iterable<OrderDTO> getOrdersByCustomer(){

        Iterable<Order> orderList = orderService.getAllOrdersByCustomer(this.currentCustomerID);
        return DTOUtils.getDTO(orderList);
    }


    @PostMapping("/orders")
    public OrderDTO saveOrder(@RequestBody OrderBodyPost order) {
        LocalDateTime dateTime = LocalDateTime.now();

        TicketCategory ticketCategory = ticketCategoryService.findById(order.getTicketCategoryID());
        Customer customer = customerService.findById(this.currentCustomerID);

        Order newOrder = new Order(customer, ticketCategory, dateTime, order.getNumberOfTickets(), order.getNumberOfTickets() * ticketCategory.getPrice());

        return DTOUtils.getDTO(orderService.save(newOrder));
    }
}
