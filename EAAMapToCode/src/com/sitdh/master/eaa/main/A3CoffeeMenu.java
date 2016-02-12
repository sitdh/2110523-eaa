package com.sitdh.master.eaa.main;

public class A3CoffeeMenu {
	
	private String[] coffeeList;
	
	public A3CoffeeMenu() {
		coffeeList = new String[]{"Espresso,Small,2.40", "Espresso,Tall,3.00", "Hot Latte,Small,3.00", "Hot Latte,Tall, 3.50"};
	}
	
	public String[] getCoffeeList() {
		return coffeeList;
	}
	
	public void displayMenu() {
		B3CoffeeDetail coffeeDetail = new B3CoffeeDetail();
		
		for(String coffee : this.coffeeList) {
			coffeeDetail.printMenu(coffee);
		}
	}

}
