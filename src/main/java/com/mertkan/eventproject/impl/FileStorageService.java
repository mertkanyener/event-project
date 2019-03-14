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

    private Path fileStorageLocation;

    @Autowired
    public FileStorageService(FileStorageProperties fileStorageProperties) {
        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
                .toAbsolutePath().normalize();

    }

    public String storeFile(MultipartFile file) {

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            Path targetLocation = this.fileStorageLocation.resolve(fileName);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            return fileName;

        }catch (IOException ex){

            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);

        }

    }

    public Path getFileStorageLocation() {
        return fileStorageLocation;
    }

    public void setFileStorageLocation(Path fileStorageLocation) {
        this.fileStorageLocation = fileStorageLocation;
    }
}
