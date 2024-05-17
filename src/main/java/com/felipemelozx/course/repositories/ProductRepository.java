package com.felipemelozx.course.repositories;

import com.felipemelozx.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
