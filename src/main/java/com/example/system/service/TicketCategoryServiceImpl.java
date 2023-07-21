package com.example.system.service;

import com.example.system.domain.TicketCategory;
import com.example.system.repository.OrderRepo;
import com.example.system.repository.TicketCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketCategoryServiceImpl implements TicketCategoryService{
    @Autowired
    private TicketCategoryRepo ticketCategoryRepo;


    @Override
    public TicketCategory findById(Long id) {
        return ticketCategoryRepo.findById(id).get();
    }
}
