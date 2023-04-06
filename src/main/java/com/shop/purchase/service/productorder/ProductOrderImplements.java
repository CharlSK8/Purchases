package com.shop.purchase.service.productorder;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.purchase.entity.Order;
import com.shop.purchase.entity.Product;
import com.shop.purchase.entity.ProductOrder;
import com.shop.purchase.entity.ProductOrderPK;
import com.shop.purchase.repository.OrderRepository;
import com.shop.purchase.repository.ProductOrderRepository;
import com.shop.purchase.repository.ProductRepository;

@Service
public class ProductOrderImplements implements ProductOrderService{
	
	@Autowired
	private ProductOrderRepository productOrderRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Optional<List<ProductOrder>> findAll() {
		return Optional.ofNullable(productOrderRepository.findAll());
	}

	@Override
	public void save(int productId, int orderId) {
		
		Optional<Order> order = orderRepository.findById(orderId);
		Optional<Product> product = productRepository.findById(productId);
		
		ProductOrderPK productOrderPK = new ProductOrderPK();
		productOrderPK.setOrder(order.get());
		productOrderPK.setProduct(product.get());
		
		ProductOrder productOrder = new ProductOrder();
		productOrder.setId(productOrderPK);
		
		productOrderRepository.save(productOrder);
	}

	

}
