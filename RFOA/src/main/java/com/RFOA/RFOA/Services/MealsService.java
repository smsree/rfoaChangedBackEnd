package com.RFOA.RFOA.Services;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.RFOA.RFOA.model.Meals;
public interface MealsService {
	public List<Meals> getAllmeals();
	public Meals getMealById(String id);
	public ResponseEntity<String> addNewmeal(Meals m);
	public ResponseEntity<String> removeOldmealById(String id);
}
