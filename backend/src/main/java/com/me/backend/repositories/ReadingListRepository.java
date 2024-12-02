package com.me.backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.me.backend.models.ReadingList;

public interface ReadingListRepository extends MongoRepository<ReadingList, String> {}
