package com.me.backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "ranting")
public class Rating {
    @Id
    private String id; 
    private String userId;
    private String bookId;
    private int stars;
    private String comment;
}
