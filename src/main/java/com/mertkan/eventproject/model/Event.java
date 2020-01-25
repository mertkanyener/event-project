package com.mertkan.eventproject.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "event")
public class Event {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "time", nullable = false)
    private LocalTime time;
    @Column(name = "image")
    private String image;
    @ManyToOne
    @JoinColumn(name = "venue_id", nullable = false)
    private Venue venue;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "event_artist", joinColumns =
    @JoinColumn(name = "event_id"), inverseJoinColumns =
    @JoinColumn(name = "artist_id"))
    private List<Artist> artists;
    @Column(name = "web_link", unique = true)
    private String webLink;
    @ManyToMany()
    @JoinTable(name = "event_genre", joinColumns =
    @JoinColumn(name = "event_id"), inverseJoinColumns =
    @JoinColumn(name = "genre_id"))
    private List<Genre> genres;
    @Column(name = "spotify_link")
    private String spotifyLink;

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return startDate;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setDate(LocalDate date) {
        this.startDate = date;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Long getVenue_Id() { return venue.getId(); }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public String getSpotifyLink() {
        return spotifyLink;
    }

    public void setSpotifyLink(String spotifyLink) {
        this.spotifyLink = spotifyLink;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
