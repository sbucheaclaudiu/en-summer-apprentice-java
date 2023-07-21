package com.example.system.service;

import com.example.system.domain.Customer;
import com.example.system.domain.Event;
import com.example.system.repository.CustomerRepo;
import com.example.system.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public Customer findById(Long id) {
        return customerRepo.findById(id).get();
    }
}
