package com.RFOA.RFOA.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.RFOA.RFOA.model.UserRegistration;
import com.RFOA.RFOA.repository.UserRegistrationRepository;
@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
	
	@Autowired
	private UserRegistrationRepository userRegistrationRepository;
	@Override
	public List<UserRegistration> getAllUser() {
		
		return userRegistrationRepository.findAll();
	}

	@Override
	public UserRegistration getUserById(String id) {
		return userRegistrationRepository.findById(id).get();
	}

	@Override
	public ResponseEntity<String> addNewUser(UserRegistration u) {
		userRegistrationRepository.save(u);
		return new ResponseEntity<String>("New user registered successfully",HttpStatus.OK);
	}

}
