package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.ProductDTO;


@SpringBootApplication
public class ProductServiceClientApplication {

	public static void main(String[] args) {
		
ConfigurableApplicationContext ctx=	SpringApplication.run(ProductServiceClientApplication.class, args);
		
		AnnotationConfigServletWebServerApplicationContext bc = null;
		
		RestTemplate bean= ctx.getBean("template",RestTemplate.class);
		
	ProductDTO[] list=	bean.getForObject("http://localhost:8080/api/v1/products", ProductDTO[].class);
	
	
	for(ProductDTO data:list){
		System.out.println(data);
	}
		
		//access the resttemplate bean
		//make a get req to capture the return valeue
		
		//print it using forEach adn methodReference
	}
	
	@Bean	
	RestTemplate template() {
		return new RestTemplate();
		
	}

}
