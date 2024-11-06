package com.me.backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "ranting")
public class Rating {
    @Id
    private Long id; 
    private Long userId;
    private Long bookId;
    private int stars;
    private String comment;
}
