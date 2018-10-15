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
@RequestMapping(path = "/admin")
public class EventController {

    @Autowired
    EventService eventService;

    @Autowired
    VenueService venueService;

    @Autowired
    ArtistService artistService;

    // event mappings

    @PostMapping(path = "/events")
    public void saveEvent(@RequestBody Event event) {
        eventService.save(event);
    }

    @GetMapping(path = "/events")
    public List<Event> getAllEvents() {
        return eventService.getAll();
    }

    @GetMapping(path = "/events/{id}")
    public Event getEvent(@PathVariable Long id) {
        return eventService.findByEventId(id);
    }

    @PutMapping(path = "/events/{id}")
    public void updateEvent(@PathVariable Long id, @RequestBody Event event) {
        event.setId(id);
        eventService.save(event);
    }

    @DeleteMapping(path = "/events/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventService.delete(id);
    }

    // venue mappings

    @GetMapping(path = "/venues")
    public List<Venue> getAllVenues() {
        return venueService.getAll();
    }

    @PostMapping(path = "/venues")
    public void saveVenue(@RequestBody Venue venue) {
        venueService.save(venue);
    }

    @GetMapping(path = "/venues/{id}")
    public Venue getVenue(@PathVariable Long id) {
        return venueService.findByVenueId(id);
    }

    @PutMapping(path = "/venues/{id}")
    public void updateVenue(@PathVariable Long id, @RequestBody Venue venue) {
        venue.setId(id);
        venueService.save(venue);
    }

    @DeleteMapping(path = "/venues/{id}")
    public void deleteVenue(@PathVariable Long id) {
        venueService.delete(id);
    }

    // artist mappings

    @GetMapping(path = "/artists")
    public List<Artist> getAllArtists() {
         return artistService.getAll();
    }

    @PostMapping(path = "/artists")
    public void saveArtist(@RequestBody Artist artist) {
        artistService.save(artist);
    }

    @GetMapping(path = "/artists/{id}")
    public Artist getArtist(@PathVariable Long id) {
        return artistService.findByArtistId(id);
    }

    @PutMapping(path = "/artists/{id}")
    public void updateArtist(@PathVariable Long id, @RequestBody Artist artist) {
        artist.setId(id);
        artistService.save(artist);
    }
    @DeleteMapping(path = "/artists/{id}")
    public void deleteArtist(@PathVariable Long id) {
        artistService.delete(id);
    }



}
