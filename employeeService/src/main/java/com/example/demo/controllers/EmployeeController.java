package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.services.EmployeeService;

@RestController
@RequestMapping(path="/employees")
@CrossOrigin(origins="*")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping
	List<Employee> findAll(){
		return this.service.findAll();
	}
	
	@PostMapping
	Employee save(@RequestBody Employee entity) {
		return this.service.addEmployee(entity);
	}
	
	@PutMapping("/{id}")
	Employee updateEmployee(@PathVariable("id") int id,@RequestBody Employee entity) {
		return this.service.updateEmployee(entity);
	}
	
	@DeleteMapping("/{id}")
	void deleteEmployee(@PathVariable("id") int id) {
		
 this.service.deleteEmployee(id);
}
	}
