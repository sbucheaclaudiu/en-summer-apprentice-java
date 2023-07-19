package com.example.system.repository;

import com.example.system.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {
    Customer findCustomerByCustomerName(String name);
}
