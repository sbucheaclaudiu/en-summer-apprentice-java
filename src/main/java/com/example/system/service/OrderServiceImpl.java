package com.example.system.service;

import com.example.system.domain.Customer;
import com.example.system.domain.Order;
import com.example.system.dto.OrderDTO;
import com.example.system.repository.EventRepo;
import com.example.system.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepo orderRepo;

    @Override
    public Iterable<OrderDTO> getAllOrdersByCustomer(Long customerID) {
        return getDTOIterable(orderRepo.getOrderByCustomer_CustomerID(customerID));
    }

    @Override
    public OrderDTO save(Order order) {
        return getDTO(orderRepo.save(order));
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
