package com.example.system.service;

import com.example.system.domain.Customer;
import com.example.system.domain.Order;
import com.example.system.domain.OrderBodyPost;
import com.example.system.domain.TicketCategory;
import com.example.system.dto.OrderDTO;
import com.example.system.repository.CustomerRepo;
import com.example.system.repository.EventRepo;
import com.example.system.repository.OrderRepo;
import com.example.system.repository.TicketCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private TicketCategoryRepo ticketCategoryRepo;

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Iterable<OrderDTO> getAllOrdersByCustomer(Long customerID) {
        return getDTOIterable(orderRepo.getOrderByCustomer_CustomerID(customerID));
    }

    @Override
    public OrderDTO save(OrderBodyPost order, Long customerID) {
        LocalDateTime dateTime = LocalDateTime.now();

        TicketCategory ticketCategory = ticketCategoryRepo.findById(order.getTicketCategoryID()).get();
        Customer customer = customerRepo.findById(customerID).get();

        Order newOrder = new Order(customer, ticketCategory, dateTime, order.getNumberOfTickets(), order.getNumberOfTickets() * ticketCategory.getPrice());

        return getDTO(orderRepo.save(newOrder));
    }

    private static OrderDTO getDTO(Order order){
        return new OrderDTO(order.getTicketCategory().getEvent().getEventID(), order.getOrderedAt(), order.getTicketCategory().getTicketCategoryID(), order.getNumberOfTickets(), order.getTotalPrice());
    }

    private static Iterable<OrderDTO> getDTOIterable(Iterable<Order> orderIterable){
        List<OrderDTO> orderDTOList = new ArrayList<>();

        for(Order order: orderIterable){
            orderDTOList.add(getDTO(order));
        }

        return orderDTOList;
    }

}
