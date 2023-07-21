package com.example.system.controller;

import com.example.system.domain.Event;
import com.example.system.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/system")
public class EventController {

    private EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
        System.out.println("Creating Event Controller");
    }

    @GetMapping("/events")
    public Event getEventByVenueIDAndEevntType(@RequestParam Long venueID, @RequestParam String eventType){
        return eventService.getEventByVenueIDAndEventType(venueID, eventType);
    }

}
