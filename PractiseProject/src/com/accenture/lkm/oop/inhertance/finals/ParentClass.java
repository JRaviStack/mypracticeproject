package com.accenture.lkm.oop.inhertance.finals;

public class ParentClass {
	
	// private int timer = 9; // this member variable is not visible,bcoz its private access specifier
	int timer = 9;
	int testVar;
	static final double PIE_VALUE = 3.14; 
	
	public ParentClass() {
		System.out.println("BaseClass constructor invoked!!");
	}
	
	public ParentClass(int testVar) {
		this.testVar = testVar;
		System.out.println("BaseClass constructor invoked!!"+testVar);
	}
	
	public void myMethod() {
		//timer  =10;
		System.out.println(" Base class method");
	}
}
