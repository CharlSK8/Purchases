package com.shop.purchase.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

import java.io.Serializable;

@Embeddable
public class ProductOrderPK implements Serializable {
	
	
	@ManyToOne
	@MapsId("idProduct")
	@JoinColumn(name= "product_id", insertable = false, updatable = false)
	private Product product;
	
	@ManyToOne
	@JoinColumn(name= "order_id", insertable = false, updatable = false)
	private Order order;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	
}
