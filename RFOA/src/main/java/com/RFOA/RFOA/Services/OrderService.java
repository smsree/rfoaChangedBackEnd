package com.RFOA.RFOA.Services;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.RFOA.RFOA.model.OrderMeals;
public interface OrderService {
	public List<OrderMeals> getAllOrder();
	public ResponseEntity<String> addOrder(OrderMeals o);
	public OrderMeals getOrderById(double id);
	
}
