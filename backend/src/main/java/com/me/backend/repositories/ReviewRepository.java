package com.me.backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.me.backend.models.Review;

public interface ReviewRepository extends MongoRepository<Review, String> {}
