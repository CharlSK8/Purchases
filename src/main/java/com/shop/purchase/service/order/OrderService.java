package com.shop.purchase.service.order;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shop.purchase.entity.Order;

@Service
public interface OrderService {
	
	public int findLastIdValue();

    public List<Order> findAll();

    public Optional<Order> findById(int id);

    public void save(Order order);

    public boolean deleteById(int id);
}
