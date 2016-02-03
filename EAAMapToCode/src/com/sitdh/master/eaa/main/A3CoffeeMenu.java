package com.sitdh.master.eaa.main;

import java.util.Vector;

public class A3CoffeeMenu {
	
	private Vector<B3Coffee> coffeeList;
	
	public A3CoffeeMenu() {
		coffeeList = new Vector<B3Coffee>();
	}
	
	public void addCoffee(B3Coffee coffee) {
		coffeeList.addElement(coffee);
	}
	
	public Vector<B3Coffee> getCoffeeList() {
		return coffeeList;
	}

}
