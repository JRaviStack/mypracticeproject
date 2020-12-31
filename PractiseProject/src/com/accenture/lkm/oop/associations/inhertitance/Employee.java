package com.accenture.lkm.oop.associations.inhertitance;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	
	protected int noOfHours = 9;
	
	/*
	 * public int getNoOfHours() { return noOfHours; }
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public double calculateSalary(double basicSalary,double HRA) {
	    return basicSalary+HRA;
	}

}
