package com.mertkan.eventproject.controllers;

import com.mertkan.eventproject.model.Venue;
import com.mertkan.eventproject.payload.AdminOpsResponse;
import com.mertkan.eventproject.service.VenueService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VenueController {

    private final VenueService venueService;

    public VenueController(final VenueService venueService) {
        this.venueService = venueService;
    }

    @GetMapping(path = "/venues")
    public List<Venue> getAllVenues() {
        return venueService.getAll();
    }

    @GetMapping(path = "/venues/{id}")
    public Venue getVenue(@PathVariable Long id) {
        return venueService.findByVenueId(id);
    }

    @GetMapping(path = "/venues/page/{page}/size/{size}")
    public Page<Venue> getVenuePage(@PathVariable Integer page, @PathVariable Integer size) {
        return venueService.getVenuePage(page, size);
    }

    @GetMapping(path = "/venues/city/{city}/page/{page}/size/{size}")
    public Page<Venue> getVenueByCity(@PathVariable String city, @PathVariable Integer page,
                                      @PathVariable Integer size) {
        return venueService.getVenueByCity(city, page, size);
    }


    // Admin methods

    @PostMapping(path = "/admin/venues")
    public ResponseEntity<AdminOpsResponse> saveVenue(@RequestBody Venue venue) {
        if (!venueService.validateVenueByName(venue)) {
            return ResponseEntity.badRequest()
                    .body(new AdminOpsResponse(-1l, "There is another venue with the same name!"));
        } else {
            Long id = venueService.save(venue);
            return ResponseEntity.ok(new AdminOpsResponse(id, "Venue saved successfully!"));
        }
    }

    @PutMapping(path = "/admin/venues/{id}")
    public ResponseEntity<AdminOpsResponse> updateVenue(@PathVariable Long id, @RequestBody Venue venue) {
        venue.setId(id);
        if (!venueService.validateVenueByNameAndId(venue)) {
            return ResponseEntity.badRequest()
                    .body(new AdminOpsResponse(id, "There is another venue with the same name!"));
        } else {
            venueService.update(venue);
            return ResponseEntity.ok(new AdminOpsResponse(id, "Venue updated successfully!"));
        }
    }

    @DeleteMapping(path = "/admin/venues/{id}")
    public void deleteVenue(@PathVariable Long id) {
        venueService.delete(id);
    }





}
