package com.jsp.Encapsulation;

public class Watch {
 
	private String brand;
	private String color;
	private double price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Watch(String brand, String color, double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	public void Showdetails()
	{
		System.out.println("THE WATCH IS OF BRAND "+brand+"having color as "+color+"with price of "+price);
	}
	
	
}
