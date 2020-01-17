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

    private final VenueRepository venueRepository;

    public VenueServiceImpl(final VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    @Override
    public Long save(Venue venue) {
        IDGenerator idGenerator = new IDGenerator();
        Long id = idGenerator.generate();
        venue.setId(id);
        venueRepository.save(venue);
        return id;
    }

    @Override
    public void delete(Long id) {
        venueRepository.deleteById(id);
    }

    @Override
    public void update(Venue venue) {
        venueRepository.save(venue);
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
    public boolean validateVenueByName(Venue venue) {
        if (venueRepository.findVenueByName(venue.getName()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public boolean validateVenueByNameAndId(Venue venue) {
        if (venueRepository.validateVenueByNameAndId(venue.getName(), venue.getId()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public Page<Venue> getVenuePage(Integer page, Integer size) {
        return venueRepository.getVenuePage(PageRequest.of(page, size));
    }

    @Override
    public Page<Venue> getVenueByCity(String city, Integer page, Integer size) {
        return venueRepository.getVenueByCity(city, PageRequest.of(page, size));
    }

}
