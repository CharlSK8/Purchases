package com.shop.purchase.entity;

import jakarta.persistence.*;

@Entity
@Table(name="product_order")
public class ProductOrder {

	@EmbeddedId
    private ProductOrderPK id;
	
	public ProductOrder() {
		super();
	}

	public ProductOrder(ProductOrderPK id) {
		super();
		this.id = id;
	}

	public ProductOrderPK getId() {
		return id;
	}

	public void setId(ProductOrderPK id) {
		this.id = id;
	}

	
	


	
}
