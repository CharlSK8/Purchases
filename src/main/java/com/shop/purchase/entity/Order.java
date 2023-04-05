package com.shop.purchase.entity;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


@Entity
@Table(name="orders")
public class Order {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idOrder;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", referencedColumnName="idProduct", insertable=false, updatable=false)
	@JsonIgnore
    private Product product;
   
	public Order() {
		super();
	}

	public Order(Integer idOrder, Product product) {
		super();
		this.idOrder = idOrder;
		this.product = product;
	}

	public Integer getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}


	
	/*
	@OneToMany(mappedBy = "order")
	private List<Product> productList;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", referencedColumnName="id", insertable=false, updatable=false)
    private Product product;
	*/
	

}
