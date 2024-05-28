package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {

	@Id
	@Column(name="p_id")
private int id;
	
	@Column(name="patient_name")
private String patientName;
	
	
	@JoinColumn(name="d_id",nullable=false)
	@ManyToOne
	private Doctor doctor;
	
public Patient() {
	super();
	// TODO Auto-generated constructor stub
}
public Patient(int id, String patientName,Doctor doctor) {
	super();
	this.id = id;
	this.patientName = patientName;
	this.doctor=doctor;
}
@Override
public String toString() {
	return "Patient [id=" + id + ", patientName=" + patientName + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}

}
