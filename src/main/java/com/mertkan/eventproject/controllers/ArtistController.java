package com.mertkan.eventproject.controllers;

import com.mertkan.eventproject.model.Artist;
import com.mertkan.eventproject.payload.AdminOpsResponse;
import com.mertkan.eventproject.service.ArtistService;
import org.springframework.data.domain.Page;
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
    public ResponseEntity<AdminOpsResponse> saveArtist(@RequestBody Artist artist) {
        if (!artistService.validateArtistName(artist.getName())) {
            return ResponseEntity.badRequest()
                    .body(new AdminOpsResponse(-1l, "There is another artist with the same name!"));
        } else {
            Long id = artistService.save(artist);
            return ResponseEntity.ok(new AdminOpsResponse(id, "Artist: " + artist.getName() + " saved successfully!" ));
        }

    }

    @PutMapping(path = "/admin/artists/{id}")
    public ResponseEntity<AdminOpsResponse> updateArtist(@PathVariable Long id, @RequestBody Artist artist) {
        artist.setId(id);
        if (!artistService.validateArtistNameWithId(artist)) {
            return ResponseEntity.badRequest()
                    .body(new AdminOpsResponse(id, "There is another artist with the same name!"));
        } else {
            artistService.update(artist);
            return ResponseEntity.ok(new AdminOpsResponse(id, "Artist: " + artist.getName() + " updated successfully!"));
        }

    }
    @DeleteMapping(path = "/admin/artists/{id}")
    public void deleteArtist(@PathVariable Long id) {
        artistService.delete(id);
    }


}
