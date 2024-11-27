package com.admin;

public class medDtls {
	private String Name;
	private String Category;
	private double price;
	private String Description;
	private String Status;
	private String Manufacturer;
	private String date;
	private String imgName;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	public medDtls(String name, String category, double price, String description, String status, String manufacturer,
			String date, String imgName) {
		super();
		Name = name;
		Category = category;
		this.price = price;
		Description = description;
		Status = status;
		Manufacturer = manufacturer;
		this.date = date;
		this.imgName = imgName;
	}
	public medDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "medDtls [Name=" + Name + ", Category=" + Category + ", price=" + price + ", Description=" + Description
				+ ", Status=" + Status + ", Manufacturer=" + Manufacturer + ", date=" + date + ", imgName=" + imgName
				+ "]";
	}
	
	
	
	
}
