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
		B3CoffeeDetail espressoSmall = new B3CoffeeDetail("Espresso", "Small", 2.4f);
		B3CoffeeDetail espressoTall = new B3CoffeeDetail("Espresso", "Tall", 3f);
		B3CoffeeDetail latteSmall = new B3CoffeeDetail("Hot Latte", "Small", 3f);
		B3CoffeeDetail latteTall = new B3CoffeeDetail("Hot Latte", "Tall", 3.5f);
		
		espressoSmall.print();
		espressoTall.print();
		latteSmall.print();
		latteTall.print();
	}

}
