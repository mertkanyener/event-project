package com.mertkan.eventproject.service;

import com.mertkan.eventproject.model.Artist;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ArtistService {

    void save(Artist artist);
    void delete(Long id);
    void update(Artist artist);
    Artist findByArtistId(Long id);
    List<Artist> getAll();
    Page<Artist> getArtistsPage(Integer page, Integer size);

}
