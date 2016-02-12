package com.sitdh.master.eaa.main;

public class A5Department {
	
	public String name;
	
	public String departmentDescription;
	
	public B5Professor headOfDepartment;
	
	public A5Department() {
		headOfDepartment = new B5Professor();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	public B5Professor getHeadOfDepartment() {
		return headOfDepartment;
	}

	public void setHeadOfDepartment(B5Professor headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}
	
	public void displayDepartmentInformation() {
		
	}
	
}
