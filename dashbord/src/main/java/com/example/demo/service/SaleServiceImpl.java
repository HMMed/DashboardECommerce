package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.SaleRepository;

@Service // indicate to spring that it is a service layer
public class SaleServiceImpl implements SaleService{
	
	@Autowired
	private SaleRepository saleRepository;
	
	public Integer dailySal() {
		return saleRepository.getDailySales();
		
	}
	
	public Integer increaseSal(){
		Integer x,y=0;
		x = saleRepository.getDailySales();
		y = saleRepository.getPreviousDailySales();
		return ((x-y)/y)*100;

	}

}
