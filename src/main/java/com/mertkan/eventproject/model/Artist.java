package com.mertkan.eventproject.model;

import javax.persistence.*;

@Entity
@Table(name = "artist")
public class Artist {

    @Id
    @SequenceGenerator(name="artist_seq", initialValue = 1001, allocationSize = 3)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "artist_seq")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "image")
    private String image;
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
}
