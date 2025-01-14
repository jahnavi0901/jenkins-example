package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

import com.example.demo.ifaces.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	public Employee addEmployee(Employee entity) {
		return this.repo.save(entity);
		
	}
	public  List<Employee> findAll(){
		return this.repo.findAll();
	}
	
	public Employee findById(int id) {
		return this.repo.findById(id)
				.orElseThrow(()->new RuntimeException
						("Element with given Id not found "+id));
		
	}
	public Employee updateEmployee(Employee entity) {
		return this.repo.save(entity);
	}
	public void deleteEmployee(int id) {
		
		Employee elementById = null;
		if(this.repo.existsById(id)) {
			 elementById =this.findById(id);
		
		 this.repo.deleteById(id);
		
	}
	
	}}
