package com.example.demo.entity;


import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Component
@Table(name="tasks")
public class Tasks {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="task")
	private String task;
	
	@Column(name="assigned_to")
	private String assignedTo;
	
	@Column(name="completion_date")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate completionDate;
	public int getId() {
		return id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public LocalDate getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(LocalDate completionDate) {
		this.completionDate = completionDate;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Tasks [id=" + id + ", task=" + task + ", assignedTo=" + assignedTo + ", completionDate="
				+ completionDate + "]";
	}
	public Tasks(int id, String task, String assignedTo, LocalDate completionDate) {
		super();
		this.id = id;
		this.task = task;
		this.assignedTo = assignedTo;
		this.completionDate = completionDate;
	}
	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
