package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.ProductRepository;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return new CommandLineRunner() {
			@Autowired
			ProductRepository repo;
			
			@Override
			public void run(String ...args) throws Exception{
				repo.save(new Product(102,"LG",45000,LocalDate.of(2015, 3,10)));
				
			
		
	};

};
	}}
