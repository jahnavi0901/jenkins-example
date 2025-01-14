package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.*;


@Service 
public class EmployeeService {
	
	
	private HashMap<String,List<String>> list;
	public EmployeeService() {
		super();
		this.list=new HashMap<>();
		this.list.put("hr", List.of("Ramesh","john"));
		this.list.put("finance", List.of("Ramesh","john","Sunny"));
		}
	
	public List<String> getData(String dept){
		
		return this.list.get(dept);
		
	}
	
}
