package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.example.demo.model.Order;

public interface OrderRepository extends MongoRepository<Order, Integer>{

	//Recuperate the sum of day's orders
	@Query("SELECT sum (totalSum) FROM Order WHERE date =: DATE( NOW() )")
	public Integer getDailyOrders();

	
	//Recuperate the sum of previous day's orders
	@Query("SELECT sum (totalSum) "
			+ "FROM Order "
			+ "WHERE date =: DATE( SELECT DATEADD(day, -1, CAST(GETDATE() AS date)) AS YesterdayDate; )")
	public Integer getPreviousDailyOrders();
	
}
