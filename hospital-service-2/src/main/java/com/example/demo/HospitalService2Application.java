package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ifaces.DoctorRepo;
import com.example.demo.ifaces.PatientRepo;
import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;

@SpringBootApplication
public class HospitalService2Application {
	
	@Autowired
	DoctorRepo repo_main;
	
	@Autowired
	PatientRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(HospitalService2Application.class, args);
	}
	
	

}
