package com.accenture.lkm.oop.associations.inhertitance;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee employee = new RegularEmployee(); // upcasting
		
		//RegularEmployee regularEmployee = new Employee();
		
		//DownCasting
		RegularEmployee regularEmployee = (RegularEmployee)employee;
	}

}
