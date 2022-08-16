package com.paymentchain.product.repository;

import com.paymentchain.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jpradagu
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
