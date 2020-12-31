package com.accenture.lkm.oop.associations.inhertitance;

public class EmployeeClient {

	public static void main(String[] args) {
		RegularEmployee regularEmployee = new RegularEmployee();
		regularEmployee.setEmployeeId(1001);
		regularEmployee.setEmployeeName("Ravi");
		System.out.println("===Regular Employee===");
		System.out.println(regularEmployee.getEmployeeId()
				+", "+regularEmployee.getEmployeeName());
		System.out.println(regularEmployee.regualarEmployeeRole());
		System.out.println(regularEmployee.calculateSalary(8000, 3300));
		
		
		ContractEmployee contractEmployee = new ContractEmployee();
		contractEmployee.setEmployeeId(10001);
		contractEmployee.setEmployeeName("Kumar");
		System.out.println("===contract Employee===");
		System.out.println(contractEmployee.getEmployeeId()+", "+contractEmployee.getEmployeeName());
		System.out.println(contractEmployee.contractEmployeeRole());
		System.out.println(contractEmployee.calculateSalary(7000, 4000));
		
	}

}
