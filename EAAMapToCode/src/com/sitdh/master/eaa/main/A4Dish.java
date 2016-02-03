package com.sitdh.master.eaa.main;

public class A4Dish {
	
	public String dishSize;
	
	public String color;
	
	private B4Food food;
	
	public A4Dish() {
		dishSize = "Large";
		color = "White";
	}

	public String getDishSize() {
		return dishSize;
	}

	public void setDishSize(String dishSize) {
		this.dishSize = dishSize;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public B4Food getFood() {
		return food;
	}

	public void setFood(B4Food food) {
		this.food = food;
	}
	
}
