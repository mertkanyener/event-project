package com.mertkan.eventproject.impl;

import com.mertkan.eventproject.model.Artist;
import com.mertkan.eventproject.repository.ArtistRepository;
import com.mertkan.eventproject.service.ArtistService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(final ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public void save(Artist artist) {
        artistRepository.save(artist);
    }

    @Override
    public void delete(Long id) {
        artistRepository.deleteById(id);
    }

    @Override
    public void update(Artist artist) {
    }

    @Override
    public List<Artist> getAll() {
        return artistRepository.findAll();
    }

    @Override
    public Artist findByArtistId(Long id) {
        return artistRepository.findByArtistId(id);
    }

    @Override
    public Page<Artist> getArtistsPage(Integer page, Integer size) {
        return artistRepository.getArtists(PageRequest.of(page, size));
    }
}
