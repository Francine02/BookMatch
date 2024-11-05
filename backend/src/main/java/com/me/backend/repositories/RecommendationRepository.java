package com.me.backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.me.backend.models.Recommendation;

public interface RecommendationRepository extends MongoRepository<Recommendation, Long> {}
