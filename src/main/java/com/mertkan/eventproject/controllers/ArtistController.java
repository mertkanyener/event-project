package com.mertkan.eventproject.controllers;

import com.mertkan.eventproject.model.Artist;
import com.mertkan.eventproject.service.ArtistService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    //User methods

    @GetMapping(path = "/user/{userId}/artists/liked")
    public List<Artist> getLikedArtists(@PathVariable Long userId) { return artistService.findLikedArtists(userId); }


    //Admin methods

    @PostMapping(path = "/admin/artists")
    public ResponseEntity<String> saveArtist(@RequestBody Artist artist) {
        if (!artistService.validateArtistName(artist.getName())) {
            return ResponseEntity.badRequest()
                    .body("There is another artist with the same name!");
        }
        return ResponseEntity.status(HttpStatus.OK)
                .body("Artist saved successfully!");

    }

    @PutMapping(path = "/admin/artists/{id}")
    public void updateArtist(@PathVariable Long id, @RequestBody Artist artist) {
        artist.setId(id);
        artistService.update(artist);
    }
    @DeleteMapping(path = "/admin/artists/{id}")
    public void deleteArtist(@PathVariable Long id) {
        artistService.delete(id);
    }


}
