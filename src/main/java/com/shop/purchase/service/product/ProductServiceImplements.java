package com.shop.purchase.service.product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.purchase.entity.Product;
import com.shop.purchase.repository.ProductRepository;

@Service
public class ProductServiceImplements implements ProductService{
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> findById(int id) {
		return productRepository.findById(id);
	}

	@Override
	public void save(Product product) {
		productRepository.save(product);
	}

	@Override
	public boolean deleteById(int id) {
		productRepository.deleteById(id);
		return false;
	}

}
