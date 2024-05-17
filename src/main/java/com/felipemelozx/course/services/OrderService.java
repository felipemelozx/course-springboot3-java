package com.felipemelozx.course.services;


import com.felipemelozx.course.entities.Order;
import com.felipemelozx.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }


    public Order findById(Long id){
        Optional<Order> obg = repository.findById(id);
        return obg.get();
    }
}
