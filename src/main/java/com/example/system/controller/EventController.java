package com.example.system.controller;

import com.example.system.domain.Event;
import com.example.system.dto.DTOUtils;
import com.example.system.dto.EventDTO;
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
    public EventDTO getEventByVenueIDAndEevntType(@RequestParam Long venueID, @RequestParam String eventType){
        return DTOUtils.getDTO(eventService.getEventByVenueIDAndEventType(venueID, eventType));
    }

}
