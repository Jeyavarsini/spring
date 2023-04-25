package com.example.entry.dress;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Dress {
	@Id

	private int dId;
	private String Name;
	private String Brand;
	private int Size;
	private int Price;
	private int Discount;
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getDiscount() {
		return Discount;
	}
	public void setDiscount(int discount) {
		Discount = discount;
	}
	
	

}
