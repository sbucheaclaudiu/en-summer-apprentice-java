package com.example.system.repository;

import com.example.system.domain.Customer;
import com.example.system.domain.Event;
import com.example.system.domain.EventType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepo extends CrudRepository<Event, Long> {

    Iterable<Event> findEventsByVenue_VenueIDAndEventType_EventTypeName(Long venueID, String eventTypeName);

    Iterable<Event> findEventsByVenue_VenueID(Long venueID);

    Iterable<Event> findEventsByEventType_EventTypeName(String eventTypeName);
}
