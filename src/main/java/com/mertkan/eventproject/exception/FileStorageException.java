package com.mertkan.eventproject.exception;

public class FileStorageException extends RuntimeException {

    public FileStorageException(String message){
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }

}
