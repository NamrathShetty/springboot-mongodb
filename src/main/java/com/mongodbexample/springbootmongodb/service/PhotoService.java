package com.mongodbexample.springbootmongodb.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.mongodbexample.springbootmongodb.collection.Photo;

public interface PhotoService {

    String addPhoto(String originalFilename, MultipartFile image) throws IOException;

    Photo getPhoto(String id);
    
}
