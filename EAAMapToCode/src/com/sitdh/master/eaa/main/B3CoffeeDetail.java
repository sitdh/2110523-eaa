package com.sitdh.master.eaa.main;

public class B3CoffeeDetail {
	
	public String name;
	
	public float price;
	
	public String size;
	
	public B3CoffeeDetail(String name, String size, float price) {
		this.setName(name);
		this.setSize(size);
		this.setPrice(price);
	}
	
	public void print() {
		System.out.println(String.format("%s for %s $%.00f", name, size, price));
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
}
