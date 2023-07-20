package com.example.system.controller;

import com.example.system.domain.Customer;
import com.example.system.domain.Order;
import com.example.system.service.CustomerService;
import com.example.system.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
        System.out.println("Creating Customer Controller");
    }

    @GetMapping("/system/customers")
    public Iterable<Customer> getEvents(){
        return customerService.getAllCustomers();
    }
}
