package com.mertkan.eventproject.service;

import com.mertkan.eventproject.model.Venue;
import org.springframework.data.domain.Page;

import java.util.List;

public interface VenueService {

    Long save(Venue venue);
    void delete(Long id);
    void update(Venue venue);
    Venue findByVenueId(Long id);
    List<Venue> getAll();
    Page<Venue> getVenuePage(Integer page, Integer size);
    Page<Venue> getVenueByCity(String city, Integer page, Integer size);

    boolean validateVenueByName(Venue venue);
    boolean validateVenueByNameAndId(Venue venue);

}
