package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.OrderRepository;

@Service // indicate to spring that it is a service layer
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;
	
	public Integer dailyOrd() {
		return orderRepository.getDailyOrders();
		
	}
	
	public Integer increaseOrd(){
		Integer x,y=0;
		x = orderRepository.getDailyOrders();
		y = orderRepository.getPreviousDailyOrders();
		return ((x-y)/y)*100;

	}

}