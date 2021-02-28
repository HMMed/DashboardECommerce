package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.OrderService;

//Enable the requests from this URL
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	//recuperate the sum of the daily sales
	@GetMapping("/dailyOrders")
	public Integer dailyOrders() {
		return orderService.dailyOrd();
	}

	//recuperate the percentage of the increase sales compared to the previous day
	@GetMapping("/dailySales")
	public Integer increaseOrders() {
		return orderService.increaseOrd();
	}
}