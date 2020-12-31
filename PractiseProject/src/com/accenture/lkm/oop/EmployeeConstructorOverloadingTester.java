package com.accenture.lkm.oop;

public class EmployeeConstructorOverloadingTester {

	public static void main(String[] args) {

		Employee employee = new Employee(1001, "Vaibhav");
		employee.setSalary(900000);
		System.out.println(employee);
		
		Employee employee1 = new Employee(1002);
		employee1.setEmployeeName("Gajendra");
		employee1.setSalary(900000);
		System.out.println(employee1);
		
		Employee employee2 = new Employee(1003, "Hitesh", 900000);
		System.out.println(employee2);
		
	}
	
	

}
