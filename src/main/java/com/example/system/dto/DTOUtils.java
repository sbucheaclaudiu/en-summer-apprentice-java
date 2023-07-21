package com.example.system.dto;

import com.example.system.domain.Event;
import com.example.system.domain.Order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DTOUtils {

    public static EventDTO getDTO(Event event){
        return new EventDTO(event.getEventID(), event.getEventType().getEventTypeName(), event.getVenue(), event.getEventName(), event.getStartDate(), event.getEndDate(), event.getDescription(), event.getTicketCategoryList());
    }

    public static OrderDTO getDTO(Order order){
        return new OrderDTO(order.getTicketCategory().getEvent().getEventID(), order.getOrderedAt(), order.getTicketCategory().getTicketCategoryID(), order.getNumberOfTickets(), order.getTotalPrice());
    }

    public static Iterable<OrderDTO> getDTO(Iterable<Order> orderIterable){
        List<OrderDTO> orderDTOList = new ArrayList<>();

        for(Order order: orderIterable){
            orderDTOList.add(getDTO(order));
        }

        return orderDTOList;
    }
}
