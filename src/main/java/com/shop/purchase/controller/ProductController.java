package com.shop.purchase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shop.purchase.entity.Product;
import com.shop.purchase.service.product.ProductServiceImplements;


@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController {
	
	@Autowired
	private ProductServiceImplements productService;
	
	
	@GetMapping("/all")
	@ResponseStatus(HttpStatus.OK)
	public Optional<List<Product>> getAllProducts(){
		return productService.findAll();
	}
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.OK)
	public void saveProduct(@RequestBody Product product) {
		productService.save(product);
	}
	
	@GetMapping("/{id}")
	public Optional<Product> getById(@PathVariable Integer id) {
		return productService.findById(id);
		
	}
	

}
