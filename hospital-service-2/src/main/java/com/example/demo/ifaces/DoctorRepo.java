package com.example.demo.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor,Integer>{

}
