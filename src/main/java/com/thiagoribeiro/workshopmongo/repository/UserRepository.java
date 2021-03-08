package com.thiagoribeiro.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thiagoribeiro.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
