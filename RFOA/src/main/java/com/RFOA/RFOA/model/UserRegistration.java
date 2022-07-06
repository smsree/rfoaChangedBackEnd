package com.RFOA.RFOA.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserRegistration {
	private String name;
	@Id
	private String email;
	private String phoneNumber;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRegistration(String name, String email, String phoneNumber, String password) {
	
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	public UserRegistration() {
		
	}
	@Override
	public String toString() {
		return "UserRegistration [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", password="
				+ password + "]";
	}
	
	
}
