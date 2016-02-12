package com.sitdh.master.eaa.main;

public class A6Car {

	private B6CarEngine engine;
	
	public A6Car(B6CarEngine engine) {
		
	}
	
	public void startCar() {
		System.out.println("car> Starting the car");
		System.out.println(
				String.format(
						"car> Wake up engine No. %s (%s)", 
						this.engine.getEngineName(), 
						this.engine.getSerialNumber()
						)
				);
		engine.startEngine();
	}
}
