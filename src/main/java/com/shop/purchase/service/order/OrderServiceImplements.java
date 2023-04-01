package com.shop.purchase.service.order;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.purchase.entity.Order;

import com.shop.purchase.repository.OrderRepository;

@Service
public class OrderServiceImplements implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public Optional<Order> findById(int id) {
		return orderRepository.findById(id);
	}

	@Override
	public void save(Order order) {
		orderRepository.save(order);	
	}

	@Override
	public boolean deleteById(int id) {
		orderRepository.deleteById(id);
		return false;
	}

	
}
