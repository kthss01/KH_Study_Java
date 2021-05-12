package com.kh.chap03_class.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String information() {
		return pName + " " + price + " " + brand;
	}
	
//	DftProduct d = new DftProduct();
}

class DftProduct { // default 접근에제어자
	private String dName;
	
	public void setDName(String dName) {
		this.dName = dName;
	}
	
}
