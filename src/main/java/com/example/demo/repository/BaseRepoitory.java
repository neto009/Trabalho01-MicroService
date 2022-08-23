package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.JsonSerializable.Base;

@Repository
public interface BaseRepoitory extends MongoRepository<Base, String> {
    
}
