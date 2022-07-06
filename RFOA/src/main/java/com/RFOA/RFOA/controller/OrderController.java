package com.RFOA.RFOA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RFOA.RFOA.Services.OrderService;
import com.RFOA.RFOA.Services.OrderServiceImpl;
import com.RFOA.RFOA.model.OrderMeals;


@RestController
@RequestMapping("/orders")
@CrossOrigin("http://localhost:3000")
public class OrderController {
	
	/*@Autowired
	private OrderRepostiory orderRepository;
	
	@PostMapping("/add")
	public ResponseEntity<String> addOrder(@RequestBody OrderMeals order)
	{
		orderRepository.save(order);
		return new ResponseEntity<String>("order added successfully",HttpStatus.OK);
	}
	@GetMapping("/all")
	public List<OrderMeals> getOrders(){
		return  orderRepository.findAll();
	}
	@GetMapping("/{id}")
	public OrderMeals getOrderById(@PathVariable double id) {
		return orderRepository.findById(id).get();	}*/
	@Autowired
	private OrderService orderService;
	
	
	public OrderService getOrderService() {
		return orderService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	@GetMapping("/all")
	public List<OrderMeals> getOrders(){
		return orderService.getAllOrder();
	}
	@GetMapping("/{id}")
	public OrderMeals getOrderByID(@PathVariable double id) {
		return orderService.getOrderById(id);
	}
	@PostMapping("/add")
	public ResponseEntity<String> addOrder(@RequestBody OrderMeals order)
	{
		return orderService.addOrder(order);
	}

}
