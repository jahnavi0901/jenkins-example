package com.example.demo.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_v2")
public class Product {
	@Id
	@Column(name="id")
	private long id;
	@Column(name="product_name",length=30)
	
	private String productName;
	@Column(name="rate_per_unit",precision=2)
	private double ratePerUnit;
	
	@Column(name="expiry_date")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate  expiryDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Product(long id, String productName, double ratePerUnit, LocalDate expiryDate) {
		super();
		this.id = id;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
		this.expiryDate = expiryDate;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", ratePerUnit=" + ratePerUnit + ", expiryDate="
				+ expiryDate + "]";
	}
	

}
