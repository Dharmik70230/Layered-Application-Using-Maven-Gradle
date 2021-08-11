package com.phoenix.data;

import javax.persistence.Entity;
import javax.persistence.Id;

/* 
* Auther : Dharmik Maru
* Date : 9/07/2021
* Version : 2.0
* Copyright : Sterlite Technologies
* 
* */
//Value object Class -Java Bean Class -POJO
@Entity
public class Product {
	
	@Id
	public int id;
	public String name;
	public String brand;
	public float price;
	
	public Product() {
		
	}
	public Product(int id, String name, String brand, float price) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
