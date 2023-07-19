package com.example.system.service;

import com.example.system.domain.Customer;
import com.example.system.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public Customer findCustomerByName(String name) {
        return customerRepo.findCustomerByCustomerName(name);
    }
}
