package com.example.system.service;

import com.example.system.domain.Event;
import com.example.system.domain.Order;
import com.example.system.dto.EventDTO;
import com.example.system.dto.OrderDTO;

import java.util.ArrayList;
import java.util.List;

public interface EventService{

    Iterable<EventDTO> getEventByVenueIDAndEventType(Long id, String eventTypeName);
}
