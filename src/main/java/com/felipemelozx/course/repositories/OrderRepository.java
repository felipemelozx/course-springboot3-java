package com.felipemelozx.course.repositories;

import com.felipemelozx.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
