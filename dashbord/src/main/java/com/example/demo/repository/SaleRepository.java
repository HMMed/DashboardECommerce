package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.example.demo.model.Sale;

public interface SaleRepository extends MongoRepository<Sale, Integer>{
	
	//Recuperate the sum of day's sales
	@Query("SELECT sum (totalSum) FROM Sale WHERE date =: ( NOW() )")
	public Integer getDailySales();

	
	//Recuperate the sum of previous day's sales
	@Query("SELECT sum (totalSum) "
			+ "FROM Sale "
			+ "WHERE date =: DATE( SELECT DATEADD(day, -1, CAST(GETDATE() AS date)) AS YesterdayDate; )")
	public Integer getPreviousDailySales();
	

}
