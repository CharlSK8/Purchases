package com.shop.purchase.entity;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name="products")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProduct;
	private String name;
	private String description;
	private String price;
	@Column(name="current_Stock")
	private int currentStock;
	
	
	/*
	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ProductOrder> productOrder;
	
	
	@ManyToOne
	@JoinColumn(name="product_id")
	Order order;
	*/
	public Product() {
		super();
	}

	public Product(Integer idProduct, String name, String description, String price, int currentStock) {
		super();
		this.idProduct = idProduct;
		this.name = name;
		this.description = description;
		this.price = price;
		this.currentStock = currentStock;

	}

	public Integer getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getCurrentStock() {
		return currentStock;
	}

	public void setCurrentStock(int currentStock) {
		this.currentStock = currentStock;
	}

	
}
