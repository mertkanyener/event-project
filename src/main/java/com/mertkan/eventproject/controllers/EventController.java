package com.mertkan.eventproject.controllers;

import com.mertkan.eventproject.model.Artist;
import com.mertkan.eventproject.model.Event;
import com.mertkan.eventproject.model.Venue;
import com.mertkan.eventproject.service.ArtistService;
import com.mertkan.eventproject.service.EventService;
import com.mertkan.eventproject.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @Autowired
    VenueService venueService;

    @Autowired
    ArtistService artistService;

    // event mappings


    @GetMapping(path = "/events")
    public List<Event> getAllEvents() {
        return eventService.getAll();
    }

    @GetMapping(path = "/events/{id}")
    public Event getEvent(@PathVariable Long id) {
        return eventService.findByEventId(id);
    }

    @GetMapping(path = "/events/now")
    public List<Event> getEventsThisMonth() { return eventService.findTillEndOfMonth(); }


    // venue mappings

    @GetMapping(path = "/venues")
    public List<Venue> getAllVenues() {
        return venueService.getAll();
    }


    @GetMapping(path = "/venues/{id}")
    public Venue getVenue(@PathVariable Long id) {
        return venueService.findByVenueId(id);
    }


    // artist mappings

    @GetMapping(path = "/artists")
    public List<Artist> getAllArtists() {
         return artistService.getAll();
    }

    @GetMapping(path = "/artists/{id}")
    public Artist getArtist(@PathVariable Long id) {
        return artistService.findByArtistId(id);
    }

    @GetMapping(path = "/artists/{id}/events")
    public List<Event> getEventsByArtist(@PathVariable Long id) { return eventService.findByArtists_Id(id); }

}
