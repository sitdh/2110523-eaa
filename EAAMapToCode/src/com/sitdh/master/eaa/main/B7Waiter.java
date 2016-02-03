package com.sitdh.master.eaa.main;

public class B7Waiter {
	
	protected C7Chef knownChef;
	
	public B7Waiter() {
		knownChef = new C7Chef();
	}
	
	public boolean sendOrderToChef(String foodName) {
		System.out.println("waiter> Waiter send an order to chef");
		
		return knownChef.cook(foodName);
	}

}
