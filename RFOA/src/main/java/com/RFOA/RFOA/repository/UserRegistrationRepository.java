package com.RFOA.RFOA.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.RFOA.RFOA.model.UserRegistration;

public interface UserRegistrationRepository extends MongoRepository<UserRegistration, String> {

}
