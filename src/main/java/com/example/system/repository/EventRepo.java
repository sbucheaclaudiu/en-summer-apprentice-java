package com.example.system.repository;

import com.example.system.domain.Customer;
import com.example.system.domain.Event;
import com.example.system.domain.EventType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends CrudRepository<Event, Long> {
    @Query("SELECT E FROM Event E \n" +
            "INNER JOIN Venue V ON E.venue.venueID = V.venueID \n" +
            "INNER JOIN EventType ET ON ET.eventTypeID = E.eventType.eventTypeID\n" +
            "WHERE V.venueID = 1 AND ET.eventTypeName = 'Sport'")
    Event getEventByVenueIDAndEventType();
}
