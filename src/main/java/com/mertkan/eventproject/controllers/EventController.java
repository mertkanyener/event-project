package com.mertkan.eventproject.controllers;

import com.mertkan.eventproject.model.Event;
import com.mertkan.eventproject.service.EventService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EventController {

    private final EventService eventService;

    public EventController(final EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping(path = "/events/page/{page}/size/{size}")
    public Page<Event> getAllEvents(@PathVariable Integer page, @PathVariable Integer size) {
        return eventService.getAll(page, size);
    }

    @GetMapping(path = "/events/{id}")
    public Event getEvent(@PathVariable Long id) {
        return eventService.findByEventId(id);
    }

    @GetMapping(path = "/events/now/page/{page}/size/{size}")
    public Page<Event> getEventsThisMonth(@PathVariable Integer page, @PathVariable Integer size) {
        return eventService.findTillEndOfMonth(page, size);
    }

    @GetMapping(path = "/events/month/{month}/page/{page}/size/{size}")
    public Page<Event> getEventsByMonth(@PathVariable Integer month, @PathVariable Integer page, @PathVariable Integer size) {
        return eventService.findByMonth(month, page, size);
    }

    @GetMapping(path = "/events/venue/{id}/month/{month}/year/{year}/page/{page}/size/{size}")
    public Page<Event> getEventsByVenueAndMonth(@PathVariable Integer page, @PathVariable Integer size,
                                                @PathVariable Integer month, @PathVariable Long id,
                                                @PathVariable Integer year) {
        return eventService.findByVenueAndMonth(id, month, year, page, size);
    }

    @GetMapping(path = "/events/year/{year}/month/{month}/day/{day}/page/{page}/size/{size}")
    public Page<Event> getEventsByDate(@PathVariable Integer year, @PathVariable Integer month,
                                       @PathVariable Integer day, @PathVariable Integer page,
                                       @PathVariable Integer size) {
        return eventService.findByDate(year, month, day, page, size);
    }

    @GetMapping(path = "/events/venue/{id}/page/{page}/size/{size}")
    public Page<Event> getEventsByVenue(@PathVariable Long id, @PathVariable Integer page, @PathVariable Integer size) {
        return eventService.findByVenueId(id, page, size);
    }

    @GetMapping(path = "/events/artist/{id}/page/{page}/size/{size}")
    public Page<Event> getEventsByArtist(@PathVariable Long id, @PathVariable Integer page, @PathVariable Integer size) {
        return eventService.findByArtists_Id(id, page, size);
    }

    @GetMapping(path = "/events/city/{city}/page/{page}/size/{size}")
    public Page<Event> getEventsByCity(@PathVariable String city, @PathVariable Integer page, @PathVariable Integer size) {
        return eventService.findByCity(city, page, size);
    }

    @GetMapping(path = "/events/name/{name}")
    public List<Event> getEventsByName(@PathVariable String name) {
        return eventService.findByName(name);
    }

    @GetMapping(path = "/events")
    public List<Event> getAllEvents() { return eventService.findAll(); }

    @GetMapping(path = "/events/venue/{id}")
    public List<Event> getAllEventsByVenue(@PathVariable Long id) { return eventService.findAllByVenue(id); }

    // Admin methods

    @PostMapping(path = "/admin/events")
    public void saveEvent(@RequestBody Event event) {
        eventService.save(event);
    }


    @PutMapping(path = "/admin/events/{id}")
    public void updateEvent(@PathVariable Long id, @RequestBody Event event) {
        event.setId(id);
        eventService.save(event);
    }

    @DeleteMapping(path = "/admin/events/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventService.delete(id);
    }



}
