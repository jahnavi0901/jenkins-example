package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.ProductRepository;

@Service
public class ProductService{
	
	
	@Autowired
	ProductRepository repo;
	
	public Product findByProductName(String srchValue) {
		return this.repo.findByProductName(srchValue);
	}
public List<Product> getAllRatePerUnit(@Param("srchValue") double value){
	return this.repo.getAllRatePerUnit(value);
}
	
	//jpql synta
	//insted of using table and columns we use class and field names
	
	public int updateRatePerUnit(@Param("id")int id,@Param("srchId") double revisedValue) {
		
		if(this.repo.existsById(id))
		return this.repo.updateRatePerUnit(id, revisedValue);
		return 0;
	}
//	
	
	public Product addProduct(Product entity) {
		return this.repo.save(entity);
	}
	
	public List<Product> getAllProducts(){
		return this.repo.findAll();
	}
	
	public Product updateProduct(Product entity) {
		return this.repo.save(entity);
	}
	
	public Product getProductById(int id) {
		return this.repo.findById(id).orElseThrow(()->new RuntimeException
				("Element with given Id not found "+id));
	}
	
	public void deleteProduct(int id) {
		if(this.repo.existsById(id)) {
			
			System.out.println("Product deleted successfully with id:"+id);
			this.repo.deleteById(id);
			return;
		}
		System.out.println("Product With Id given not exists");
	}
	
	public List<Product> getProductSorted(String sortBy){
		return this.repo.findAll(Sort.by(sortBy));
	}
	
}