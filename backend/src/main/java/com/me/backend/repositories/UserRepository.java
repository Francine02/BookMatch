package com.me.backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.me.backend.models.User;

public interface UserRepository extends MongoRepository<User, Long> {}
