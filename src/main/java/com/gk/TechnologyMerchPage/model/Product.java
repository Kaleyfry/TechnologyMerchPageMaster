package com.gk.TechnologyMerchPage.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private long id; 
	
	@Column(name = "quantity")
	private int quantity; 
	
	@Column(name = "price")
	private int price; 
	
	@Column(name= "Description")
	private String description;
	
	@Column(name= "Name")
	private String name;
	
	@Column(name= "Brand")
	private String brand;
	
	@Column(name= "category")
	private String category;
	
	@Column(name= "image")
	private String image;
}
