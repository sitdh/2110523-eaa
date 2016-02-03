package com.sitdh.master.eaa.main;

public class B8TaxiCar implements I8Car {

	@Override
	public void startCarEngine() {
		System.out.println("taxi> Engine started");
	}

	@Override
	public void run() {
		System.out.println("taxi> Runing");
	}

}
