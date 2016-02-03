package com.sitdh.master.eaa.main;

public class B2StaffProfile {
	
	public String name;
	
	public String workingHour;
	
	protected float salary;
	
	public B2StaffProfile() {
		name = "Thomas J.M. Potter";
		workingHour = "10:00 - 19:00";
		salary = 19500.0f;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(String workingHour) {
		this.workingHour = workingHour;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
