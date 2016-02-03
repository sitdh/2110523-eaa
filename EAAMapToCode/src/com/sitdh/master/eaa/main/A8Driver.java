package com.sitdh.master.eaa.main;

public class A8Driver {
	
	private I8Car car;

	public void getinTheCar(I8Car car) {
		System.out.println("driver> Get in the car");
		this.car = car;
	}
	
	public void drive() {
		System.out.println("driver> Star car engine");
		car.startCarEngine();
		System.out.println("driver> Drive");
		car.run();
	}
	
	

}
