package com.RFOA.RFOA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RFOA.RFOA.Exception.UserRegistrationUserNotFoundException;
import com.RFOA.RFOA.Services.UserRegistrationService;
import com.RFOA.RFOA.model.UserRegistration;
import com.RFOA.RFOA.repository.UserRegistrationRepository;

@RestController
@RequestMapping("/userRegistration")
@CrossOrigin("http://localhost:3000")
public class UserRegistrationController {
/*	@Autowired
	private UserRegistrationRepository userRegRepo;
	@GetMapping("/all")
	public List<UserRegistration> getAllRegisteredUser(){
		return userRegRepo.findAll();
	}
	@GetMapping("/find/{id}")
	public UserRegistration getById(@PathVariable String id) {
		
		return userRegRepo.findById(id).get();
	}
	@PostMapping("/add")
	public ResponseEntity<String> addNewUser(@RequestBody UserRegistration user){
		userRegRepo.save(user);
		return new ResponseEntity<String>("User added successfully",HttpStatus.OK);
	}*/
	
	@Autowired
	private UserRegistrationService userRegistrationService;
	
	public UserRegistrationService getUserRegistrationService() {
		return userRegistrationService;
	}
	public void setUserRegistrationService(UserRegistrationService userRegistrationService) {
		this.userRegistrationService = userRegistrationService;
	}
	@GetMapping("/all")
	public List<UserRegistration> getAllRegisteredUser(){
		return userRegistrationService.getAllUser();
	}
	@GetMapping("/find/{id}")
	public UserRegistration getById(@PathVariable String id) {
		try {
			 return userRegistrationService.getUserById(id);
		}
		catch(Exception e) {
			
		}
		return null;
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addNewUser(@RequestBody UserRegistration user){
		userRegistrationService.addNewUser(user);
		return new ResponseEntity<String>("User added successfully",HttpStatus.OK);
	}
}
