package com.shop.purchase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shop.purchase.entity.ProductOrder;
import com.shop.purchase.service.productorder.ProductOrderImplements;

@RestController
@RequestMapping("/purchase")
public class ProductOrderController {
	
	@Autowired
	ProductOrderImplements productOrderImplements;
	
	@PostMapping("/save/{idproduct}/{idOrder}")
	@ResponseStatus(HttpStatus.OK)
	public void save(@PathVariable int idproduct, @PathVariable int idOrder) {
		productOrderImplements.save(idproduct,idOrder);
		
	}
	
	@GetMapping("/all")
	@ResponseStatus(HttpStatus.OK)
	public Optional<List<ProductOrder>> findAll(){
		return productOrderImplements.findAll();
		
	}

}
