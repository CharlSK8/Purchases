package com.shop.purchase.service.product;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shop.purchase.entity.Product;

@Service
public interface ProductService {
	

    public List<Product> findAll();

    public Optional<Product> findById(int id);

    public void save(Product product);

    public boolean deleteById(int id);

}
