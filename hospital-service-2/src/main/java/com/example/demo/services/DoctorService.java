package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ifaces.DoctorRepo;
import com.example.demo.model.Doctor;

@Service
public class DoctorService {
	
	
	@Autowired
	DoctorRepo repo;
	
public List<Doctor> getAll(){
	return this.repo.findAll();
}

public Doctor save(Doctor entity) {
	return this.repo.save(entity);
}
	

}
