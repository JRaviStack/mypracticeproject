package com.accenture.lkm.oop;
public class EmployeeClient {

	public static void main(String[] args) {
		//Employee object creation
		System.out.println("==Employee details==");
		Employee e1 = new Employee();
		//String greetMessage = e1.greetEmployee();
	//	System.out.println(greetMessage);
		e1.setEmployeeId(1001);
		e1.setEmployeeName("Ravi");
		e1.setSalary(850000);
		//e1.displayEmployeeDetails();
		//System.out.println(e1.displayDetails());
		
		Employee e2 = new Employee();
		//System.out.println(e2.greetEmployee());
		e2.setEmployeeId(1002);
		e2.setEmployeeName("Prerana");
		e2.setSalary(900000);
	//	e2.displayEmployeeDetails(); // not returning any value
	//	System.out.println(e2.displayDetails()); // return String
		
		
		
	}

}
