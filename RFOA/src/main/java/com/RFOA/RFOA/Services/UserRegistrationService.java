package com.RFOA.RFOA.Services;

import java.util.List;

import org.springframework.http.ResponseEntity;


import com.RFOA.RFOA.model.UserRegistration;

public interface UserRegistrationService {
	public List<UserRegistration> getAllUser();
	public UserRegistration getUserById(String id);
	public ResponseEntity<String> addNewUser(UserRegistration u);
}
