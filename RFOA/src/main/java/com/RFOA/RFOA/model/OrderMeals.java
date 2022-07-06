package com.RFOA.RFOA.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class OrderMeals {

	ArrayList<Meals> orderedItems=new ArrayList<>();
	@Id
	private double primaryKey;
	private double totalAmount;
	public ArrayList<Meals> getOrderedItems() {
		return orderedItems;
	}
	public void setOrderedItems(ArrayList<Meals> orderedItems) {
		this.orderedItems = orderedItems;
	}
	public double getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(double primaryKey) {
		this.primaryKey = primaryKey;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public OrderMeals(ArrayList<Meals> orderedItems, double primaryKey, double totalAmount) {
		super();
		this.orderedItems = orderedItems;
		this.primaryKey = primaryKey;
		this.totalAmount = totalAmount;
	}
	public OrderMeals() {
		super();
	}
	
	
	
}
