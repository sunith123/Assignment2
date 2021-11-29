package com.naveen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naveen.model.Order;



public interface OrderRepository extends MongoRepository<Order,Integer> {

}
