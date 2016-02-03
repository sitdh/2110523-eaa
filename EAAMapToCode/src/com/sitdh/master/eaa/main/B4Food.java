package com.sitdh.master.eaa.main;

public class B4Food {
	
	public String name;
	
	public String description;
	
	public float price;
	
	protected A4Dish placeInDish;
	
	public B4Food() {
		name = "Tuna salad sandwiches and Cole Slaw";
		description = "Serve a scoop on top of a green salad, or between two pieces of bread with fresh lettuce. Sprinkle a little paprika on top to add a little flavor and color.";
		price = 5f;
		
		placeInDish = new A4Dish();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public A4Dish getPlaceInDish() {
		return placeInDish;
	}

	public void setPlaceInDish(A4Dish placeInDish) {
		this.placeInDish = placeInDish;
	}

}
