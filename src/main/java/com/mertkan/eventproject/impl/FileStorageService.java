package com.mertkan.eventproject.impl;

import com.mertkan.eventproject.config.FileStorageProperties;
import com.mertkan.eventproject.exception.FileStorageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileStorageService {

    private Path artistStorageLocation;
    private Path eventStorageLocation;
    private Path userStorageLocation;
    private Path venueStorageLocation;

    @Autowired
    public FileStorageService(FileStorageProperties fileStorageProperties) {
        this.artistStorageLocation = Paths.get(fileStorageProperties.getArtistUploadDir())
                .toAbsolutePath().normalize();
        this.eventStorageLocation = Paths.get(fileStorageProperties.getEventUploadDir())
                .toAbsolutePath().normalize();
        this.userStorageLocation = Paths.get(fileStorageProperties.getUserUploadDir())
                .toAbsolutePath().normalize();
        this.venueStorageLocation = Paths.get(fileStorageProperties.getVenueUploadDir())
                .toAbsolutePath().normalize();

    }

    public String storeFile(MultipartFile file, String objectType) {

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Path targetLocation = null;

        try {
            if (objectType.equals("artist")) {
                targetLocation = this.artistStorageLocation.resolve(fileName);
            } else if (objectType.equals("event")) {
                targetLocation = this.eventStorageLocation.resolve(fileName);
            } else if (objectType.equals("user")) {
                targetLocation = this.userStorageLocation.resolve(fileName);
            } else {
                targetLocation = this.venueStorageLocation.resolve(fileName);
            }
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            return fileName;

        }catch (IOException ex){

            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);

        }

    }

    public Path getArtistStorageLocation() {
        return artistStorageLocation;
    }

    public void setArtistStorageLocation(Path artistStorageLocation) {
        this.artistStorageLocation = artistStorageLocation;
    }

    public Path getEventStorageLocation() {
        return eventStorageLocation;
    }

    public void setEventStorageLocation(Path eventStorageLocation) {
        this.eventStorageLocation = eventStorageLocation;
    }

    public Path getVenueStorageLocation() {
        return venueStorageLocation;
    }

    public void setVenueStorageLocation(Path venueStorageLocation) {
        this.venueStorageLocation = venueStorageLocation;
    }

    public Path getUserStorageLocation() {
        return userStorageLocation;
    }

    public void setUserStorageLocation(Path userStorageLocation) {
        this.userStorageLocation = userStorageLocation;
    }
}
