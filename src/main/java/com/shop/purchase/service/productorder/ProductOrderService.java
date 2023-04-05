package com.shop.purchase.service.productorder;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shop.purchase.entity.ProductOrder;

@Service
public interface ProductOrderService {

	public Optional<List<ProductOrder>> findAll();

    public void save(int productId, int orderId);

}
