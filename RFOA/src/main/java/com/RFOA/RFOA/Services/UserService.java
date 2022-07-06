package com.RFOA.RFOA.Services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.RFOA.RFOA.model.User;

public interface UserService {
	public List<User> getAllUser();
	public User getUserById(String id);
	public ResponseEntity<String> addNewUser(User u);
	
}
