package com.sitdh.master.eaa.main;

import java.util.ArrayList;
import java.util.List;

public class A3CoffeeMenu {
	
	private List<B3CoffeeDetail> coffeeList;
	
	public A3CoffeeMenu() {
		coffeeList = new ArrayList<B3CoffeeDetail>(); // {"Espresso,Small,2.40", "Espresso,Tall,3.00", "Hot Latte,Small,3.00", "Hot Latte,Tall, 3.50"};
	}
	
	public void setCoffeeList(List<B3CoffeeDetail> coffeeList) {
		this.coffeeList = coffeeList;
	}
	
	public List<B3CoffeeDetail> getCoffeeList() {
		return coffeeList;
	}
	
	public void displayMenu() {
		for(B3CoffeeDetail coffeeDetail : this.coffeeList) {
			coffeeDetail.print();
		}
	}

}
