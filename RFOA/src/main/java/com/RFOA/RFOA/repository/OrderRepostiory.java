package com.RFOA.RFOA.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.RFOA.RFOA.model.OrderMeals;

@Repository
public interface OrderRepostiory extends MongoRepository<OrderMeals,Double>{
	
}
