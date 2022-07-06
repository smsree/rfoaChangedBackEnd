package com.RFOA.RFOA.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GreenHomeFoodGlobalExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<String> userRegistrationUserNotFoundExceptionHandler(UserRegistrationUserNotFoundException ex){
		return new ResponseEntity<String>("The User not found..",HttpStatus.NOT_FOUND);
	}
}
