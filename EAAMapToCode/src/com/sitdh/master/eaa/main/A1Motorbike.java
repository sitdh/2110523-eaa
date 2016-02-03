package com.sitdh.master.eaa.main;

public class A1Motorbike {
	
	public float wheelSize;
	
	private float length;
	
	protected String blueprint;
	
	public A1Motorbike() {
		wheelSize = 24.25f;
		length = 341.33f;
		blueprint = "Motorbike blueprint";
	}

	public float getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(float wheelSize) {
		this.wheelSize = wheelSize;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public String getBlueprint() {
		return blueprint;
	}

	public void setBlueprint(String blueprint) {
		this.blueprint = blueprint;
	}

}
