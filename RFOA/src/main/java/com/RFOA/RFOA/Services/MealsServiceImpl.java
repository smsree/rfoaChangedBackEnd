package com.RFOA.RFOA.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.RFOA.RFOA.model.Meals;
import com.RFOA.RFOA.repository.MealsRepository;
@Service
public class MealsServiceImpl implements MealsService {
	@Autowired
	private MealsRepository mealsRepository;
	
	@Override
	public List<Meals> getAllmeals() {
		return mealsRepository.findAll();
	}

	@Override
	public Meals getMealById(String id) {
		return mealsRepository.findById(id).get();
	}

	@Override
	public ResponseEntity<String> addNewmeal(Meals m) {
		mealsRepository.save(m);
		return new ResponseEntity<String>("New meals added successfylly: ",HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> removeOldmealById(String id) {
		mealsRepository.deleteById(id);
		return new ResponseEntity<String>("Value deleted successfully",HttpStatus.OK);
	}

}
