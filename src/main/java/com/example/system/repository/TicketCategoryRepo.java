package com.example.system.repository;

import com.example.system.domain.TicketCategory;
import org.springframework.data.repository.CrudRepository;

public interface TicketCategoryRepo extends CrudRepository<TicketCategory, Long> {
}
