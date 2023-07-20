package com.example.system.controller;

import com.example.system.domain.Event;
import com.example.system.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {

    private EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
        System.out.println("Creating Event Controller");
    }

    @GetMapping("/system/events")
    public Iterable<Event> getEvents(){
        return eventService.getAllEvents();
    }

    @GetMapping("/system/eventByVenueIDAndEventType")
    public Event getEventByVenueIDAndEevntType(){
        return eventService.getEventByVenueIDAndEventType();
    }

}
