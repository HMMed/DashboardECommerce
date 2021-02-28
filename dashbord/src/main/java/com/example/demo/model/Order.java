package com.example.demo.model;

import java.util.Date;
import org.springframework.data.annotation.Id;

public class Order {

	@Id
	private String id;
	
	private Date date;
	
	private Integer totalSum;
	
	private String country;

	
	//////////////
	public Order (Date date, Integer totalSum, String country) {
		super();
		this.date = date;
		this.totalSum = totalSum;
		this.country = country;
	}

	public Order() {
		super();
	}
	
	
	//////////////
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getTotalSum() {
		return totalSum;
	}

	public void setTotalSum(Integer totalSum) {
		this.totalSum = totalSum;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
