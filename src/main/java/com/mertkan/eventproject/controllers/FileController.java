package com.mertkan.eventproject.controllers;

import com.mertkan.eventproject.impl.FileStorageService;
import com.mertkan.eventproject.payload.UploadFileResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FileController {

    private final FileStorageService fileStorageService;

    public FileController(final FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    @PostMapping("/admin/images/{type}/{id}")
    public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file, @PathVariable("type") String type,
                                         @PathVariable("id") Long id){

        String fileName = fileStorageService.storeFile(file, type, id);
        System.out.println("File name: " + fileName);
        String filePath;
        if (type.equals("artist")) {
            filePath = fileStorageService.getArtistStorageLocation().toString() + "\\" + fileName;
            System.out.println("File path: " + filePath);
        } else if (type.equals("event")) {
            filePath = fileStorageService.getEventStorageLocation().toString() + "\\" + fileName;
        } else {
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
