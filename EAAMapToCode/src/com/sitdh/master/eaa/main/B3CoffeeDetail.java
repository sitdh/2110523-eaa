package com.sitdh.master.eaa.main;

public class B3CoffeeDetail {
	
	public String name;
	
	public float price;
	
	public String size;
	
	public void printMenu(String coffeeInformation) {
		String[] coffeeInfo = this.coffeeExtractor(coffeeInformation);
		System.out.println(String.format("%s for %s $%s", coffeeInfo[0], coffeeInfo[1], coffeeInfo[2]));
	}
	
	public String[] coffeeExtractor(String coffeeInformation) {
		return coffeeInformation.split(",");
	}
}
