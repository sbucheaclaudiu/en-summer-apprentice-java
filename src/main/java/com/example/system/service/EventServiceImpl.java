package com.example.system.service;

import com.example.system.domain.Event;
import com.example.system.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventServiceImpl implements EventService{
    @Autowired
    private EventRepo eventRepo;

    @Override
    public Iterable<Event> getAllEvents() {
        return (List<Event>) eventRepo.findAll();
    }
}
