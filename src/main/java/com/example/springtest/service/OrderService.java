package com.example.springtest.service;

import com.example.springtest.entities.Order;
import com.example.springtest.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }
    public Order findById(Long id){
        Optional<Order> orderId = orderRepository.findById(id);
        return orderId.get();
    }
}
