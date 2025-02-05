package com.example.demo;

import java.time.LocalDate;

import org.apache.naming.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Tasks;
import com.example.demo.services.TasksService;

@SpringBootApplication
public class TasksServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
				SpringApplication.run(TasksServiceApplication.class, args);
	TasksService service=	ctx.getBean(TasksService.class);
	Tasks bean = ctx.getBean("bean",Tasks.class);
			service.deleteById(13);
			//service.save(bean);
		
	}
	@Bean
	public Tasks bean() {
		return new Tasks(13,"Ui designer","John",LocalDate.of(2024,8,16));
	}

}
