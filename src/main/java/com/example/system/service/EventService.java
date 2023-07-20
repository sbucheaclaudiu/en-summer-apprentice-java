package com.example.system.service;

import com.example.system.domain.Event;
import com.example.system.domain.Order;

import java.util.List;

public interface EventService{

    Iterable<Event> getAllEvents();
    Event getEventByVenueIDAndEventType(Long id, String eventTypeName);
}
