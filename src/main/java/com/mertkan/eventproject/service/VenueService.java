package com.mertkan.eventproject.service;

import com.mertkan.eventproject.model.Venue;

import java.util.List;

public interface VenueService {

    void save(Venue venue);
    void delete(Long id);
    void update(Venue venue);
    Venue findByVenueId(Long id);
    List<Venue> getAll();

}
