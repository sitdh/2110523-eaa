package com.sitdh.master.eaa.main;

public class B1Helicopter {
	
	public float paddleLength;
	
	private float weight;
	
	protected String blueprint;
	
	public B1Helicopter() {
		paddleLength = 890.12f;
		weight = 354.21f;
		blueprint = "Helicopter blueprint";
	}

	public float getPaddleLength() {
		return paddleLength;
	}

	public void setPaddleLength(float paddleLength) {
		this.paddleLength = paddleLength;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getBlueprint() {
		return blueprint;
	}

	public void setBlueprint(String blueprint) {
		this.blueprint = blueprint;
	}

	
}
