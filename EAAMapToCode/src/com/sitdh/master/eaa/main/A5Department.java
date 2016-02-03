package com.sitdh.master.eaa.main;

import java.util.Vector;

public class A5Department {
	
	public String name;
	
	public String departmentDescription;
	
	public Vector<B5Professor> professors;
	
	public A5Department() {
		professors = new Vector<B5Professor>();
	}
	
	public void addProfessor(B5Professor professor) {
		professors.addElement(professor);
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

	public Vector<B5Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(Vector<B5Professor> professors) {
		this.professors = professors;
	}

}
