package com.sitdh.master.eaa.main;

public class A6Ellipse {
	
	private float radius;
	private B6CoordinatePoint focusPointA, focusPointB;
	
	public A6Ellipse(float radius, B6CoordinatePoint focusPointA, B6CoordinatePoint focusPointB) {
		this.radius = radius;
		this.focusPointA = focusPointA;
		this.focusPointB = focusPointB;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public B6CoordinatePoint getFocusPointA() {
		return focusPointA;
	}

	public void setFocusPointA(B6CoordinatePoint focusPointA) {
		this.focusPointA = focusPointA;
	}

	public B6CoordinatePoint getFocusPointB() {
		return focusPointB;
	}

	public void setFocusPointB(B6CoordinatePoint focusPointB) {
		this.focusPointB = focusPointB;
	}
	
	public String rendorEllipse() {
		return "Ellipse draw";
	}
	
	public float getMajorAxis() {
		return 5.34f;
	}
	
	public float getMinorAxis() {
		return 3.14f;
	}
	
}
