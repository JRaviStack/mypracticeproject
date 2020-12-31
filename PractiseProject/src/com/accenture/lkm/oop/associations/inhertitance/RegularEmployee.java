package com.accenture.lkm.oop.associations.inhertitance;

public class RegularEmployee extends Employee{ //Association [IS-A]
	
	public String regualarEmployeeRole() {
		return "Regular Employee Role be explained here!!";
	}
	
	@Override
	public double calculateSalary(double basicSalary,double HRA) {
	    return basicSalary+HRA+5;
	}

}
