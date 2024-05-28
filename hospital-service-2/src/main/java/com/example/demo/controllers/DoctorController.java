package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.services.DoctorService;
import com.example.demo.services.PatientService;

@RestController
public class DoctorController {
	@Autowired
	DoctorService  service;
	
	
	@Autowired
	PatientService service_p;
	
	@GetMapping
	List<Doctor> getAll(){
		return this.service.getAll();
		
	}
	
	@PostMapping
	Doctor save(@RequestBody Doctor doctor) {
		return this.service.save(doctor);
	}
	
	@GetMapping("/patient")
	List<Patient> getAllPatients(){
		return this.service_p.getAllPatients();
	}
	
	@PostMapping("/patient")
	Patient  savePatient(@RequestBody Patient patient) {
		return this.service_p.save(patient);
	}
	
	
	
	
	
	
	
	

}
