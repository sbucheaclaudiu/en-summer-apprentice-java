package com.example.system.controller;

import com.example.system.dto.EventDTO;
import com.example.system.service.EventService;
import org.springframework.web.bind.annotation.*;

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
    public Iterable<EventDTO> getEventByVenueIDAndEevntType(@RequestParam(name = "venueId", required = false) Long venueID, @RequestParam(name = "eventType", required = false) String eventType){
        return eventService.getEventByVenueIDAndEventType(venueID, eventType);
    }

}
