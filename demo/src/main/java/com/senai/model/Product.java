package com.senai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String name;
	private String brand;
	private String madein;
	private float price;
	
	public Product() {
		
	}
	
	public Product(Long id, String name, String brand, String madein, float price) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.madein = madein;
		this.price = price;
	}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public String getMadein() {
		return madein;
	}
	public String getName() {
		return name;
	}
	public float getPrice() {
		return price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setMadein(String madein) {
		this.madein = madein;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
