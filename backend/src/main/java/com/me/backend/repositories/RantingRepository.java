package com.me.backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.me.backend.models.Ranting;

public interface RantingRepository extends MongoRepository<Ranting, Long> {}
