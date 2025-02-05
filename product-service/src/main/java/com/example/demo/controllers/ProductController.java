
package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.services.ProductService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@RestController
@RequestMapping(path="/api/v1/products")
@OpenAPIDefinition(info=@Info(title="Product Service",version="1.0"))
public class ProductController {
	
	@Autowired
	ProductService service;

@GetMapping
  List<Product> getAllProducts(){
		return this.service.getAllProducts();
		
	}

@GetMapping("/{id}")
public  Product getProduct(@PathVariable("id")int id){
	
	return this.service.getProductById(id);
	
}

@PostMapping(consumes = "application/json")
Product addProduct(@RequestBody Product product) {
	return this.service.addProduct(product);
}

@PutMapping
Product updateProduct (Product product) {
	return this.service.updateProduct(product);
	
}

@DeleteMapping("/delete/{id}")
void deleteProduct(@PathVariable int id){
	this.service.deleteProduct(id);
}

@GetMapping("/findpdct/{srchValue}")
Product findByProductName(@PathVariable String srchValue) {
	return this.service.findByProductName(srchValue);
}

//
@GetMapping("allrateperunit/{srchValue}")
List<Product> getAllRatePerUnit(@PathVariable("srchValue") double value){
	return this.service.getAllRatePerUnit(value);
}
//
//
//@PatchMapping("/{id}/{rpu}")
//
////jpql syntax
////insted of using table and columns we use class and field names
//
@GetMapping("/rateperunit/{revisedValue}")
int updateRatePerUnit(@PathVariable("id") int id,@PathVariable("revisedValue") double revisedValue) {
	return this.service.updateRatePerUnit(id,revisedValue);
}
//
//



	

}
