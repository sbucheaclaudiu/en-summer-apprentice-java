package com.example.system.service;

import com.example.system.domain.Customer;
import com.example.system.domain.Order;
import com.example.system.domain.OrderDTO;
import com.example.system.domain.TicketCategory;
import com.example.system.repository.EventRepo;
import com.example.system.repository.OrderRepo;
import com.example.system.repository.TicketCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;


@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private EventRepo eventRepo;

    @Autowired
    private TicketCategoryRepo ticketCategoryRepo;

    private Customer currentCustomer;

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    public void setCurrentCustomer(Customer currentCustomer) {
        this.currentCustomer = currentCustomer;
    }

    public Order saveOrder(OrderDTO order){

        LocalDateTime dateTime = LocalDateTime.now();

        Optional<TicketCategory> ticketCategory = ticketCategoryRepo.findById(order.getTicketCategoryID());

        Order newOrder = new Order(this.currentCustomer, ticketCategory.get(), dateTime, order.getNumberOfTickets(), order.getNumberOfTickets() * ticketCategory.get().getPrice());

        return orderRepo.save(newOrder);
    }
}
