package com.mertkan.eventproject.service;

import com.mertkan.eventproject.model.Artist;

import java.util.List;

public interface ArtistService {

    void save(Artist artist);
    void delete(Long id);
    void update(Artist artist);
    Artist findByArtistId(Long id);
    List<Artist> getAll();

}
