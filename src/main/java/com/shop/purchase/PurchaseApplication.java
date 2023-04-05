package com.shop.purchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shop.purchase.entity.Order;
import com.shop.purchase.entity.Product;

@SpringBootApplication
public class PurchaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseApplication.class, args);
	}

}
