package com.me.backend.models;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "review")
public class Review {
    @Id
    private String id;
    private String userId;
    private String bookId;
    private String content;
    private Date createdAt;
}
