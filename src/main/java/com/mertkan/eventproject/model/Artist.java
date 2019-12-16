package com.mertkan.eventproject.model;

import javax.persistence.*;

@Entity
@Table(name = "artist")
public class Artist {

    @Id
    private Long id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(name = "image")
    private String image;
    @Column(name = "instagram")
    private String instagram;
    @Column(name = "twitter")
    private String twitter;
    @Column(name = "facebook")
    private String facebook;
    @Column(name = "spotify")
    private String spotify;
    @Column(name = "alt_images")
    private String[] altImages;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String[] getAltImages() {
        return altImages;
    }

    public void setAltImages(String[] altImages) {
        this.altImages = altImages;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getSpotify() {
        return spotify;
    }

    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }
}
