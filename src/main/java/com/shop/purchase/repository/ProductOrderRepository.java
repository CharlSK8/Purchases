package com.shop.purchase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.purchase.entity.ProductOrder;
import com.shop.purchase.entity.ProductOrderPK;

@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrder, ProductOrderPK>{

}
