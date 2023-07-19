package com.example.system.service;

import com.example.system.domain.Customer;

public interface CustomerService {
    Customer findCustomerByName(String name);
}
