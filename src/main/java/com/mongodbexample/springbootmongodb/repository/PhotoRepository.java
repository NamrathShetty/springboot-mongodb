package com.mongodbexample.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodbexample.springbootmongodb.collection.Photo;

@Repository
public interface PhotoRepository extends MongoRepository<Photo, String>{
    
}
