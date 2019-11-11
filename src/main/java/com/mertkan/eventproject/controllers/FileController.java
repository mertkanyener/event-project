package com.mertkan.eventproject.controllers;

import com.mertkan.eventproject.impl.FileStorageService;
import com.mertkan.eventproject.model.Artist;
import com.mertkan.eventproject.model.Event;
import com.mertkan.eventproject.model.Venue;
import com.mertkan.eventproject.payload.UploadFileResponse;
import com.mertkan.eventproject.service.ArtistService;
import com.mertkan.eventproject.service.EventService;
import com.mertkan.eventproject.service.VenueService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FileController {

    private final FileStorageService fileStorageService;
    private final ArtistService artistService;
    private final EventService eventService;
    private final VenueService venueService;

    public FileController(final FileStorageService fileStorageService,
                          final ArtistService artistService,
                          final EventService eventService,
                          final VenueService venueService) {
        this.fileStorageService = fileStorageService;
        this.artistService = artistService;
        this.eventService = eventService;
        this.venueService = venueService;
    }

    @PostMapping("/admin/images/{type}/{id}")
    public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file, @PathVariable("type") String type,
                                         @PathVariable("id") Long id){

        String fileName = fileStorageService.storeFile(file, type, id);
        String imageServerPath = "http://localhost:9999/images/";
        System.out.println("File name: " + fileName);
        String filePath;
        if (type.equals("artist")) {
            Artist artist = artistService.findByArtistId(id);
            artist.setImage(imageServerPath + "artists/" + fileName);
            artistService.update(artist);
            filePath = fileStorageService.getArtistStorageLocation().toString() + "\\" + fileName;
        } else if (type.equals("event")) {
            Event event = eventService.findByEventId(id);
            event.setImage(imageServerPath + "events/" + fileName);
            filePath = fileStorageService.getEventStorageLocation().toString() + "\\" + fileName;
        } else {
            Venue venue = venueService.findByVenueId(id);
            venue.setImage(imageServerPath + "venues/" + fileName);
            filePath = fileStorageService.getVenueStorageLocation().toString() + "\\" + fileName;
        }

        return new UploadFileResponse(fileName, filePath, file.getContentType(), file.getSize());

    }

    @PostMapping("/user/{userId}/image/upload")
    public UploadFileResponse uploadUserImage(@RequestParam("file") MultipartFile file, @PathVariable("userId") Long userId) {
        String fileName = fileStorageService.storeFile(file, "user", userId);
        String filePath = fileStorageService.getUserStorageLocation().toString() + "\\" + fileName;

        return new UploadFileResponse(fileName, filePath, file.getContentType(), file.getSize());
    }

    @PostMapping("/admin/images/multiple/{type}/{id}")
    public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files,
                                                        @PathVariable("type") String type,
                                                        @PathVariable("id") Long id) {
        return Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file, type, id))
                .collect(Collectors.toList());
    }
}
