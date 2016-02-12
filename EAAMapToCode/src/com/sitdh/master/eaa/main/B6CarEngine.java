package com.sitdh.master.eaa.main;

public class B6CarEngine {
	
	public String engineName;
	
	public String serialNumber;
	
	public void startEngine() {
		System.out.println("engine> Engine booting up");
		System.out.println("engine> Initializing parameters");
		System.out.println("engine> Engine started");
	}
	
	public String getEngineName() {
		return engineName;
	}
	
	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

}
