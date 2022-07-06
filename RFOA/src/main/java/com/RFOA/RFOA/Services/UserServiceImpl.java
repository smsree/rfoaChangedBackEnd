package com.RFOA.RFOA.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.RFOA.RFOA.model.User;
import com.RFOA.RFOA.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
		
	}

	@Override
	public User getUserById(String id) {
		return userRepository.findById(id).get();
	}

	@Override
	public ResponseEntity<String> addNewUser(User u) {
		userRepository.save(u);
		return new ResponseEntity<String>("New user added successfully",HttpStatus.OK);
	}

}
