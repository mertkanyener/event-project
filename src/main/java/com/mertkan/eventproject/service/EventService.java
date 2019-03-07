package com.mertkan.eventproject.service;

import com.mertkan.eventproject.model.Event;

import java.util.List;

public interface EventService {

    void save(Event event);
    void delete(Long id);
    void update(Event event);
    List<Event> getAll();
    List<Event> findByVenueId(Long venueId);
    Event findByEventId(Long id);
}
