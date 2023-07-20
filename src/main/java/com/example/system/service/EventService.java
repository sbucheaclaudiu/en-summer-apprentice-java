package com.example.system.service;

import com.example.system.domain.Event;

import java.util.List;

public interface EventService{
    Iterable<Event> getAllEvents();
}
