package com.mertkan.eventproject.service;

import com.mertkan.eventproject.model.Event;
import org.springframework.data.domain.Page;


public interface EventService {

    void save(Event event);
    void delete(Long id);
    void update(Event event);
    Page<Event> getAll(Integer page, Integer size);
    Page<Event> findByVenueId(Long venueId, Integer page, Integer size);
    Event findByEventId(Long id);
    Page<Event> findByArtists_Id(Long id, Integer page, Integer size);
    Page<Event> findTillEndOfMonth(Integer page, Integer size);
    Page<Event> findByMonth(Integer month, Integer page, Integer size);
    Page<Event> findByDate(Integer day, Integer month, Integer year, Integer page, Integer size);
    Page<Event> findByVenueAndMonth(Long venueId, Integer month, Integer year, Integer page, Integer size);
    Page<Event> findByCity(String city, Integer page, Integer size);
}
