package com.RFOA.RFOA.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.RFOA.RFOA.model.Meals;

@Repository
public interface MealsRepository extends MongoRepository<Meals,String>{
	
}
