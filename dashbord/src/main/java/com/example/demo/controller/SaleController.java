package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SaleService;

//Enable the requests from this URL
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	//recuperate the sum of the daily sales
	@GetMapping("/dailySales")
	public Integer dailySales() {
		return saleService.dailySal();
	}

	//recuperate the percentage of the increase sales compared to the previous day
	@GetMapping("/dailySales")
	public Integer increaseSales() {
		return saleService.increaseSal();
	}
	
}
