package com.mertkan.eventproject.controllers;


import com.mertkan.eventproject.model.Artist;
import com.mertkan.eventproject.model.Event;
import com.mertkan.eventproject.model.Venue;
import com.mertkan.eventproject.service.ArtistService;
import com.mertkan.eventproject.service.EventService;
import com.mertkan.eventproject.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/admin")
public class AdminController {

    @Autowired
    private ArtistService artistService;

    @Autowired
    private EventService eventService;

    @Autowired
    private VenueService venueService;


    //Artist mappings

    @PostMapping(path = "/artists")
    public void saveArtist(@RequestBody Artist artist) {
        artistService.save(artist);
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

    //Event mappings

    @PostMapping(path = "/events")
    public void saveEvent(@RequestBody Event event) {
        eventService.save(event);
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


    //Venue mappings

    @PostMapping(path = "/venues")
    public void saveVenue(@RequestBody Venue venue) {
        venueService.save(venue);
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






}
