package com.sitdh.master.eaa.main;

public class A7Customer {
	
	private B7Waiter waiter;
	
	public A7Customer() {
		
	}
	
	public void callForWaiter(B7Waiter waiter) {
		System.out.println("customer> Call for waiter");
		this.waiter = waiter;
	}
	
	public boolean makeAnOrder(String foodOrder) {
		System.out.println("customer> Select for food " + foodOrder);
		
		return waiter.sendOrderToChef(foodOrder);
	}

}
