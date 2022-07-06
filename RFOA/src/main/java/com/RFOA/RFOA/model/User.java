package com.RFOA.RFOA.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	@Id
	private String primaryKey;
	private String email;
	
	private String name;
	private String street;
	private String city;
	private String pincode;
	private String phoneNumber;
	public String getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(String primaryKey, String email, String name, String street, String city, String pincode,
			String phoneNumber) {
		super();
		this.primaryKey = primaryKey;
		this.email = email;
		this.name = name;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.phoneNumber = phoneNumber;
	}
	public User() {
		super();
	}
	

}
