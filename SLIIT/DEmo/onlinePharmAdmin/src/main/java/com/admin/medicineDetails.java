package com.admin;

import java.time.LocalDate;

public class medicineDetails {
	private int id;
	private String name;
	private String category;
	private double price;
	private String discription;
	private String status;
	private String Manufac;
	private LocalDate expDate;
	private byte[] image;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public double getPrice() {
		return price;
	}
	public String getDiscription() {
		return discription;
	}
	public String getStatus() {
		return status;
	}
	public String getManufac() {
		return Manufac;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public byte[] getImage() {
		return image;
	}
	public medicineDetails(int id, String name, String category, double price, String discription, String status,
			String manufac, LocalDate expDate, byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.discription = discription;
		this.status = status;
		Manufac = manufac;
		this.expDate = expDate;
		this.image = image;
	}
	
	


}
