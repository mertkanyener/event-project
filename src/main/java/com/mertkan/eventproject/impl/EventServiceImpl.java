package com.mertkan.eventproject.impl;

import com.mertkan.eventproject.model.Event;
import com.mertkan.eventproject.repository.EventRepository;
import com.mertkan.eventproject.service.EventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventRepository;

    @Override
    public void save(Event event) {
        eventRepository.save(event);
    }

    @Override
    public void delete(Long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public void update(Event event) {

    }

    @Override
    public Page<Event> getAll(Integer page, Integer size) {
        return eventRepository.getAll(PageRequest.of(page, size));
    }

    @Override
    public Page<Event> findByVenueId(Long venueId, Integer page, Integer size) {
        return eventRepository.findByVenueId(venueId, PageRequest.of(page, size));
    }

    @Override
    public Event findByEventId(Long id) {
        return eventRepository.findByEventId(id);
    }

    @Override
    public Page<Event> findByArtists_Id(Long id) {
        List<Event> events = eventRepository.findByArtists_Id(id);
        events.sort(Comparator.comparing(Event::getDate));
        return events;
    }

    @Override
    public List<Event> findTillEndOfMonth() {

        LocalDate now = LocalDate.now();
        LocalDate monthEnd = now.withDayOfMonth(now.lengthOfMonth());

        Logger logger = LoggerFactory.getLogger(EventServiceImpl.class);

        logger.info("Current date: " + now);
        logger.info("End of the month: " + monthEnd);

        return eventRepository.findTillEndOfMonth(monthEnd);
    }

    @Override
    public List<Event> findByMonth(Integer month) {

        LocalDate monthStart = LocalDate.of(LocalDate.now().getYear(), month, 1);
        LocalDate monthEnd = monthStart.withDayOfMonth(monthStart.lengthOfMonth());

        Logger logger = LoggerFactory.getLogger(EventServiceImpl.class);

        logger.info("Month Start: " + monthStart);
        logger.info("Month End: " + monthEnd);

        return eventRepository.findByMonth(monthStart, monthEnd);

    }

    @Override
    public Page<Event> findTop3EventsByVenueId(Long venueId) {
        return eventRepository.findTop3EventsByVenueId(venueId, PageRequest.of(0, 3));
    }

    @Override
    public Page<Event> findTop3EventsByArtist(Long artistId) {
        return eventRepository.findByArtists_Id(artistId, PageRequest.of(0, 3, Sort.by("date").ascending()));
    }



}
