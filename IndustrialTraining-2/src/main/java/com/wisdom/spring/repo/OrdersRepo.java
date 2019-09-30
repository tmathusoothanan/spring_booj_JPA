package com.wisdom.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisdom.spring.model.Orders;

public interface OrdersRepo extends JpaRepository<Orders, Integer> {

}
