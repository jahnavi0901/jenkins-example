package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

import com.example.demo.model.Task;

import com.example.demo.model.Task;

@SpringBootApplication
public class HospitalServiceApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(HospitalServiceApplication.class, args);
		
		AnnotationConfigServletWebServerApplicationContext bc = null;
		
		Task bean =ctx.getBean(Task.class);
		//System.out.println(bean.isSingleton("task"));
	}

}
