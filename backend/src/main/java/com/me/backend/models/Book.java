package com.me.backend.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "book")
public class Book {
    @Id
    private Long id;
    private String title;
    private String author;
    private String genre;
    private String description;
    private double averageRating;
    private List<Ranting> rantings;
    private List<Review> reviews;
}
