package com.accenture.lkm.oop.inhertance;

public class BaseClass {
	
	// private int timer = 9; // this member variable is not visible,bcoz its private access specifier
	int timer = 9;
	int testVar;
	
	public BaseClass() {
		System.out.println("BaseClass constructor invoked!!");
	}
	
	public BaseClass(int testVar) {
		this.testVar = testVar;
		System.out.println("BaseClass constructor invoked!!"+testVar);
	}
	
	public void myMethod() {
		//timer  =10;
		System.out.println(" Base class method");
	}
}
