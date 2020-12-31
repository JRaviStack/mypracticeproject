package com.accenture.lkm.oop;

public class EmployeeTester {

	public static void main(String[] args) {
		
		//using default constructor
		/*
		 * Employee employee1 = new Employee(); employee1.setEmployeeId(1001);
		 * employee1.setEmployeeName("Nadhini"); employee1.setSalary(900000);
		 * System.out.println(employee1);
		 * 
		 * Employee employee2 = new Employee(); employee2.setEmployeeId(1002);
		 * employee2.setEmployeeName("Tushar"); employee2.setSalary(900000);
		 * System.out.println(employee2);
		 */
		//using parameterized constructor
		/*
		 * Employee employee = new Employee(1001,"Shubankar",900000);
		 * System.out.println(employee);
		 */
		Employee employee = new Employee();
		System.out.println(employee);
		System.out.println(Character.getNumericValue(employee.gender));
		System.out.println(employee.gender.charValue());
		
	}

}
