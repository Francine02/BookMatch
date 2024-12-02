package com.me.backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.me.backend.models.Book;

public interface BookRepository extends MongoRepository<Book, String> {}
