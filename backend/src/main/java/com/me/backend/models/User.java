package com.me.backend.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "user")
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<String> preferences;
    private List<Book> readingHistory;
}
