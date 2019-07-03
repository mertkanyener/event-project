package com.mertkan.eventproject.service;

import com.mertkan.eventproject.model.Event;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EventService {

    void save(Event event);
    void delete(Long id);
    void update(Event event);
    List<Event> getAll();
    List<Event> findByVenueId(Long venueId);
    Event findByEventId(Long id);
    List<Event> findByArtists_Id(Long id);
    List<Event> findTillEndOfMonth();
    List<Event> findByMonth(Integer month);
    Page<Event> findTop3EventsByVenueId(Long venueId);

}
