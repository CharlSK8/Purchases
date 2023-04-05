package com.shop.purchase;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.shop.purchase.entity.Order;
import com.shop.purchase.entity.Product;
import com.shop.purchase.entity.ProductOrder;
import com.shop.purchase.entity.ProductOrderPK;
import com.shop.purchase.repository.OrderRepository;
import com.shop.purchase.repository.ProductOrderRepository;
import com.shop.purchase.repository.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class PurchaseApplicationTests {
	
	@Autowired
    private OrderRepository orderRepository;
	
	@Autowired
    private ProductRepository productRepository;
	
	@Autowired
    private ProductOrderRepository productOrderRepository;

	
	
	@Test
	public void testSave() {
		
		//List product
		
		ArrayList<ProductOrder> listProductOrder = new ArrayList<>();
		
		//Product 1
		Product  product = new Product();
		product.setIdProduct(1);
		product.setName("Ipad");
		product.setDescription("Technologies");
		product.setPrice("10000");
		product.setCurrentStock(2);
		productRepository.save(product);
		
		//Product 1
		Product  product2 = new Product();
		product2.setIdProduct(2);
		product2.setName("MacBook");
		product2.setDescription("Technologies");
		product2.setPrice("50000");
		product2.setCurrentStock(4);
		productRepository.save(product2);

		
		Order order = new Order();
		order.setIdOrder(1);
		order.setProduct(product2);
		orderRepository.save(order);
		
		
		ProductOrderPK productOrderPK = new ProductOrderPK();
		//productOrderPK.setOrder(order);
	//	productOrderPK.setProduct(product2);
		
		ProductOrder productOrder = new ProductOrder();
		productOrder.setId(productOrderPK);
		

		productOrderRepository.save(productOrder);
		
		
		
		
		System.out.println(productOrderRepository.findAll());
	}

}
