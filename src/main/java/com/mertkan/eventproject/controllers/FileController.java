package com.mertkan.eventproject.controllers;

import com.mertkan.eventproject.impl.FileStorageService;
import com.mertkan.eventproject.payload.UploadFileResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FileController {

    @Autowired
    FileStorageService fileStorageService;

    @PostMapping("/images/{type}")
    public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file, @PathVariable("type") String type){

        String fileName = fileStorageService.storeFile(file, type);
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

    @PostMapping("/images/multiple/{type}")
    public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files, @PathVariable("type") String type) {
        return Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file, type))
                .collect(Collectors.toList());
    }





}
