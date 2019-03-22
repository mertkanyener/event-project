package com.mertkan.eventproject.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {

    private String artistUploadDir;
    private String eventUploadDir;
    private String venueUploadDir;

    public String getArtistUploadDir() {
        return artistUploadDir;
    }

    public void setArtistUploadDir(String artistUploadDir) {
        this.artistUploadDir = artistUploadDir;
    }

    public String getEventUploadDir() {
        return eventUploadDir;
    }

    public void setEventUploadDir(String eventUploadDir) {
        this.eventUploadDir = eventUploadDir;
    }

    public String getVenueUploadDir() {
        return venueUploadDir;
    }

    public void setVenueUploadDir(String venueUploadDir) {
        this.venueUploadDir = venueUploadDir;
    }
}
