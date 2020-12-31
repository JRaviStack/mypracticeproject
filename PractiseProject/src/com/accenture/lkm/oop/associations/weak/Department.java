package com.accenture.lkm.oop.associations.weak;

public class Department {
	
	private int departmentId;
	private String departmentName;
	private Faculty faculty;
	
	@Override
	public String toString() {
		return "Deparment [departmentId=" + departmentId + ", departmentName=" + departmentName 
				+ ", faculty ID =" + getFaculty().getFacultyId()
				+ ", faculty name =" + getFaculty().getFacultyName()
				+ "]";
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	
	
	

}
