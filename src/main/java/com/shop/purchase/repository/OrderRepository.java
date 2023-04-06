package com.shop.purchase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shop.purchase.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
	
	@Query(value = "SELECT max(id_order) FROM orders", nativeQuery = true)
	  int findLastIdValue();
}
