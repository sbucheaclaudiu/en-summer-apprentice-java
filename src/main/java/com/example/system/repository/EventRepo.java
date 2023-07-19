package com.example.system.repository;

import com.example.system.domain.Customer;
import com.example.system.domain.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends CrudRepository<Event, Long> {

}
