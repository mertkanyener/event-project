package com.mertkan.eventproject.impl;

import com.mertkan.eventproject.model.Event;
import com.mertkan.eventproject.repository.EventRepository;
import com.mertkan.eventproject.service.EventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    public EventServiceImpl(final EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }


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
    public Page<Event> findByArtists_Id(Long id, Integer page, Integer size) {
        return eventRepository.findByArtists_Id(id, PageRequest.of(page, size));
    }

    @Override
    public Page<Event> findTillEndOfMonth(Integer page, Integer size) {

        LocalDate now = LocalDate.now();
        LocalDate monthEnd = now.withDayOfMonth(now.lengthOfMonth());

        Logger logger = LoggerFactory.getLogger(EventServiceImpl.class);

        logger.info("Current date: " + now);
        logger.info("End of the month: " + monthEnd);

        return eventRepository.findTillEndOfMonth(monthEnd, PageRequest.of(page, size));
    }

    @Override
    public Page<Event> findByMonth(Integer month, Integer page, Integer size) {

        LocalDate monthStart = LocalDate.of(LocalDate.now().getYear(), month, 1);
        LocalDate monthEnd = monthStart.withDayOfMonth(monthStart.lengthOfMonth());

        Logger logger = LoggerFactory.getLogger(EventServiceImpl.class);

        logger.info("Month Start: " + monthStart);
        logger.info("Month End: " + monthEnd);

        return eventRepository.findByMonth(monthStart, monthEnd, PageRequest.of(page, size));

    }

    @Override
    public Page<Event> findByDate(Integer day, Integer month, Integer year, Integer page, Integer size) {
        LocalDate date = LocalDate.of(year, month, day);

        Logger logger = LoggerFactory.getLogger(EventServiceImpl.class);

        logger.info("Date: " + date);

        return eventRepository.findByDate(date, PageRequest.of(page, size));

    }

    @Override
    public Page<Event> findByVenueAndMonth(Long venueId, Integer month, Integer year, Integer page, Integer size) {
        LocalDate monthStart = LocalDate.of(year, month, 1);
        LocalDate monthEnd = monthStart.withDayOfMonth(monthStart.lengthOfMonth());

        return eventRepository.findByVenueIdAndMonth(monthStart, monthEnd, venueId, PageRequest.of(page, size));
    }


}
