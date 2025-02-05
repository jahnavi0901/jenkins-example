package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Product;

import jakarta.transaction.Transactional;


public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	//syntax ufindByPropertyName
	public  Product findByProductName(String srchValue);
	
	//no need to follow any pattern bcoz a cutom pattern is written based on sql query
	@Query(value="select * from product where rate_per_unit>:srchValue",nativeQuery=true)
	public List<Product> getAllRatePerUnit(@Param("srchValue") double value);
	
	//jpql syntax
	//insted of using table and columns we use class and field names
	@Query(value="update Product set ratePerUnit=:revisedValue where id=:srchId",nativeQuery=false)
	@Modifying
	@Transactional
	public int updateRatePerUnit(@Param("srchId")int id,@Param("revisedValue") double revisedValue);

}
