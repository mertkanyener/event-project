package com.mertkan.eventproject.service;

import com.mertkan.eventproject.model.Event;
import org.springframework.data.domain.Page;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;


public interface EventService {

    Long save(Event event);
    void delete(Long id);
    void update(Event event);
    Page<Event> getAll(Integer page, Integer size);
    Page<Event> findByVenueId(Long venueId, Integer page, Integer size);
    Event findByEventId(Long id);
    Page<Event> findByArtists_Id(Long id, Integer page, Integer size);
    List<Event> findTillEndOfMonth();
    List<Event> findEventsByMonth(Integer month, Integer year);
    Page<Event> findByMonth(Integer month, Integer page, Integer size);
    Page<Event> findByDate(Integer day, Integer month, Integer year, Integer page, Integer size);
    Page<Event> findByCity(String city, Integer page, Integer size);
    List<Event> findByName(String name);
    List<Event> findAll();
    List<Event> findAllComing();
    List<Event> findAllPast();
    List<Event> findAllByVenue(Long venueId);
    List<Event> findByVenueAndMonth(Long venueId, Integer month, Integer year);
    List<Event> findSavedEvents(Long userId);
    List<Event> findAttendingEvents(Long userId);
    List<Event> findEventsByName(String name);
    List<Event> filterEvents(Collection<String> cities, Collection<Long> genres, Integer month, Integer year);
    List<Event> filterEventsByCity(Collection<String> cities, Integer month, Integer year);
    List<Event> filterEventsByGenre(Collection<Long> genres, Integer month, Integer year);
    List<Event> findByArtist(Long artistId);

    boolean validateEventArtist(Event event);
    boolean validateEventVenue(Event event);
    boolean validateEventArtistWithId(Event event);
    boolean validateEventVenueWithId(Event event);
}
