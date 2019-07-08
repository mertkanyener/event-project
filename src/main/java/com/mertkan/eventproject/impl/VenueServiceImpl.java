package com.mertkan.eventproject.impl;

import com.mertkan.eventproject.model.Venue;
import com.mertkan.eventproject.repository.VenueRepository;
import com.mertkan.eventproject.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueServiceImpl implements VenueService {

    @Autowired
    VenueRepository venueRepository;

    @Override
    public void save(Venue venue) {
        venueRepository.save(venue);
    }

    @Override
    public void delete(Long id) {
        venueRepository.deleteById(id);
    }

    @Override
    public void update(Venue venue) {
    }

    @Override
    public List<Venue> getAll() {
        return venueRepository.findAll();
    }

    @Override
    public Venue findByVenueId(Long id) {
        return venueRepository.fingByVenueId(id);
    }

    @Override
    public Page<Venue> getVenues(Integer page, Integer size) {
        return venueRepository.getVenues(PageRequest.of(page, size));
    }
}
