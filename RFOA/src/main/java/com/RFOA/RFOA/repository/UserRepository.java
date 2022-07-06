package com.RFOA.RFOA.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.RFOA.RFOA.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,String>{

}
