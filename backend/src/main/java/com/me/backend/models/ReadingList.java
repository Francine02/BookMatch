package com.me.backend.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "reading_list")
public class ReadingList {
    @Id
    private Long id;
    private Long userId;
    private List<Book> books;
}
