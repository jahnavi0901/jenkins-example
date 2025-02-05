package com.example.demo.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="doctor")
public class Doctor {
	
	@Id
	@Column(name="d_id")
	private int id;
	
	@Column(name="doctor_name")
	private String doctorName;
	public int getId() {
		return id;
	}
	
	@OneToMany(mappedBy="doctor")
	List<Patient> patients;
	
	public void setId(int id) {
		this.id = id;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int id, String doctorName) {
		super();
		this.id = id;
		this.doctorName = doctorName;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", doctorName=" + doctorName + "]";
	}
	

}
