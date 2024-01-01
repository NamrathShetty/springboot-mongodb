package com.mongodbexample.springbootmongodb.collection;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data@Document(collection = "photo")
@JsonInclude(Include.NON_NULL)
public class Photo {
    
    @Id
    private String id;
    private String title;
    private Binary photo;
}
