package com.accenture.lkm.oop.associations.weak;

public class DepartmentClient {
	
	public static void main(String[] args) {
		
		Faculty faculty = new Faculty();
		faculty.setFacultyId(1);
		faculty.setFacultyName("Ravi");
		
		Department department = new Department();
		department.setDepartmentId(1001);
		department.setDepartmentName("LKM");
		
		department.setFaculty(faculty); //Aggregation
		
		System.out.println(department.toString());
		
	}

}
