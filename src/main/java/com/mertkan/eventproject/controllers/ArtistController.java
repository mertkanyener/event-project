package com.mertkan.eventproject.controllers;

import com.mertkan.eventproject.model.Artist;
import com.mertkan.eventproject.service.ArtistService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(final ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping(path = "/artists")
    public List<Artist> getAllArtists() {
        return artistService.getAll();
    }

    @GetMapping(path = "/artists/page/{page}/size/{size}")
    public Page<Artist> getArtistPage(@PathVariable Integer page, @PathVariable Integer size ) {
        return artistService.getArtistsPage(page, size);
    }

    @GetMapping(path = "/artists/{id}")
    public Artist getArtist(@PathVariable Long id) {
        return artistService.findByArtistId(id);
    }


    //Admin methods

    @PostMapping(path = "/admin/artists")
    public void saveArtist(@RequestBody Artist artist) {
        artistService.save(artist);
    }

    @PutMapping(path = "/admin/artists/{id}")
    public void updateArtist(@PathVariable Long id, @RequestBody Artist artist) {
        artist.setId(id);
        artistService.save(artist);
    }
    @DeleteMapping(path = "/admin/artists/{id}")
    public void deleteArtist(@PathVariable Long id) {
        artistService.delete(id);
    }


}
