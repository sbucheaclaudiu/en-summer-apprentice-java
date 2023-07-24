package com.example.system.service;

import com.example.system.domain.Event;
import com.example.system.dto.EventDTO;
import com.example.system.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EventServiceImpl implements EventService{
    @Autowired
    private EventRepo eventRepo;

    @Override
    public Iterable<EventDTO> getEventByVenueIDAndEventType(Long venueId, String eventTypeName) {
        if (eventTypeName == null && venueId == null) {
            return getDTOIterable(eventRepo.findAll());
        }

        if (eventTypeName == null) {
            return getDTOIterable(eventRepo.findEventsByVenue_VenueID(venueId));
        }

        if (venueId == null) {
            return getDTOIterable(eventRepo.findEventsByEventType_EventTypeName(eventTypeName));
        }

        return getDTOIterable(eventRepo.findEventsByVenue_VenueIDAndEventType_EventTypeName(venueId, eventTypeName));
    }

    private static EventDTO getDTO(Event event){
        return new EventDTO(event.getEventID(), event.getEventType().getEventTypeName(), event.getVenue(), event.getEventName(), event.getStartDate(), event.getEndDate(), event.getDescription(), event.getTicketCategoryList());
    }

    private static Iterable<EventDTO> getDTOIterable(Iterable<Event> eventIterable){
        List<EventDTO> eventDTOList = new ArrayList<>();

        for(Event event: eventIterable){
            eventDTOList.add(getDTO(event));
        }

        return eventDTOList;
    }
}
