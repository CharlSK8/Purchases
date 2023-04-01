package com.shop.purchase.entity;

import java.util.List;

import jakarta.persistence.*;

import lombok.NoArgsConstructor;

@Entity
@Table(name="orders")
@NoArgsConstructor
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	Product product;
	
	/*
	@OneToMany(mappedBy = "order")
	List<Product> productList;
	*/
}
