package com.example.system.repository;

import com.example.system.domain.Customer;
import com.example.system.domain.Event;
import com.example.system.domain.EventType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends CrudRepository<Event, Long> {

    Event findEventsByVenue_VenueIDAndEventType_EventTypeName(Long id, String eventTypeName);
}
