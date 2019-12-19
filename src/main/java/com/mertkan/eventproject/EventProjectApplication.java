package com.mertkan.eventproject;

import com.mertkan.eventproject.config.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@EnableConfigurationProperties(FileStorageProperties.class)
@SpringBootApplication
public class EventProjectApplication extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(EventProjectApplication.class, args);
    }
}
