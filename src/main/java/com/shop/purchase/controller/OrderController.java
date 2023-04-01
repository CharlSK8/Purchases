package com.shop.purchase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shop.purchase.entity.Order;
import com.shop.purchase.service.order.OrderServiceImplements;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderServiceImplements orderService;
	
	
	@GetMapping("/all")
	@ResponseStatus(HttpStatus.OK)
	public List<Order> getAllOrders() {
		return orderService.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Order> getById(@PathVariable int id){
		return orderService.findById(id);
	}
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.OK)
	public void save(Order order) {
		orderService.save(order);
	}

}
