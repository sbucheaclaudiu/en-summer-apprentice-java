package com.example.system.service;

import com.example.system.domain.Customer;
import com.example.system.domain.Event;

public interface CustomerService {
    Customer findById(Long id);
}
