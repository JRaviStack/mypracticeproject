package com.accenture.lkm.oop;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	 Character gender;
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", gender=" + gender + "]";
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	//constructor - instantiation
	// default constructor
	Employee(){
		System.out.println("Constrcutor invoked!!");
	}
	// Parameterized constructor
	// this keyword - refers the instance variables of the class
	/*
	 * public Employee(int employeeId, String employeeName, double salary) {
	 * System.out.println("Paramerterized Constrcutor invoked!!"); this.employeeId =
	 * employeeId; this.employeeName = employeeName; this.salary = salary; }
	 */
	
	Employee(int employeeId){
		this.employeeId= employeeId;
	}
	
	Employee(int employeeId, String employeeName){
		this.employeeId= employeeId;
		this.employeeName = employeeName;
	}
	
	Employee(int employeeId, String employeeName, double salary){
		this.employeeId= employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	
	//toString :  Object -> String

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
