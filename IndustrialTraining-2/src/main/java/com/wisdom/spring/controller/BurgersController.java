package com.wisdom.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisdom.spring.model.Burgers;
import com.wisdom.spring.model.Orders;
import com.wisdom.spring.repo.BurgerRepo;
import com.wisdom.spring.repo.OrdersRepo;

@RestController
@RequestMapping(value = "/home/")
public class BurgersController {
	@Autowired
	BurgerRepo burgerRepo;
	
	@Autowired
	OrdersRepo ordersRepo;
	
	@CrossOrigin(origins = "http://localhost:9090")
	@GetMapping(value = "/burgers")
	public List<Burgers> getBurgers(){
		System.out.println("data returned");
		return burgerRepo.findAll();
		
	}
	
	@PostMapping(value = "/saveburger")
	public List<Burgers> saveBurger(Burgers burgers) {
		burgerRepo.save(burgers);
		return burgerRepo.findAll();
	}
	
	@GetMapping(value = "/orders")
	public List<Orders> getOrders(){
		return ordersRepo.findAll();
	}
	
	@PostMapping(value = "/saveorders")
	public List<Orders> saveOrders(Orders orders){
		ordersRepo.save(orders);
		return ordersRepo.findAll();
	}

}
