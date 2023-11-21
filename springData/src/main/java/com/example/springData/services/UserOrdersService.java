package com.example.springData.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springData.models.Order;
import com.example.springData.models.User;
import com.example.springData.repositories.order.OrderRepository;
import com.example.springData.repositories.user.UserRepository;

@Service
public class UserOrdersService{
	
    @Autowired
    private OrderRepository orderRepository;
 
    @Autowired
    private UserRepository userRepository;
 
    @Transactional(transactionManager="userTransactionManager")
    public List<User> getUsers()    {
        return userRepository.findAll();
    }
 
    @Transactional(transactionManager="ordersTransactionManager")
    public List<Order> getOrders()    {
        return orderRepository.findAll();
    }
}

