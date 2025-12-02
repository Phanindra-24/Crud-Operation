package com.codegnan.crud;

public class Car {
	private int id;
	private String Brand;
	private String Model;
	private double Price;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String Brand, String Model, double Price) {
		this.id = id;
		this.Brand = Brand;
		this.Model = Model;
		this.Price = Price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		this.Model = model;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		this.Price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", Brand=" + Brand + ", Model=" + Model + ", Price=" + Price + "]";
	}
}
