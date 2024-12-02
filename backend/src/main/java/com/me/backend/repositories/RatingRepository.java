package com.me.backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.me.backend.models.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {}
