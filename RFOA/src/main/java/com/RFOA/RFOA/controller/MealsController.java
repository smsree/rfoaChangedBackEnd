package com.RFOA.RFOA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RFOA.RFOA.Services.MealsServiceImpl;
import com.RFOA.RFOA.model.Meals;


@RestController
@RequestMapping("/meals")
@CrossOrigin("http://localhost:3000")
public class MealsController {
	/*@Autowired
	private MealsRepository mealsRepository;
	
	@GetMapping("/all")
	public List<Meals> showAllMeals(){
		return mealsRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Meals getMealsById(@PathVariable String id)
	{
		return mealsRepository.findById(id).get();
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addMeals(@RequestBody Meals meals){
		
		
		mealsRepository.save(meals);
		return new ResponseEntity<String>("New meals added successfylly: ",HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteMeal(@PathVariable String id){
		//System.out.println(id);
		mealsRepository.deleteById(id);
		return new ResponseEntity<String>("Value deleted successfully",HttpStatus.OK);
	}*/
	@Autowired
	private MealsServiceImpl mealService;
	@GetMapping("/all")
	public List<Meals> showAllMeals(){
		return mealService.getAllmeals();
	}
	@GetMapping("/{id}")
	public Meals getMealsById(@PathVariable String id)
	{
		return mealService.getMealById(id);
	}
	@PostMapping("/add")
	public ResponseEntity<String> addMeals(@RequestBody Meals m){
		return mealService.addNewmeal(m);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteMeal(@PathVariable String id){
		return mealService.removeOldmealById(id);
	}
	
	
	
}
