package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ifaces.PatientRepo;
import com.example.demo.model.Patient;

@Service
public class PatientService {
	
	
	
	final PatientRepo repo;

    PatientService(PatientRepo repo) {
        this.repo = repo;
    }
	
	public List<Patient>  getAllPatients(){
		return this.repo.findAll();
	}
	
	public Patient save(Patient entity) {
		return this.repo.save(entity);
	}

}
