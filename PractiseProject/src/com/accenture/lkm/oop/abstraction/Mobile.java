package com.accenture.lkm.oop.abstraction;

//abstract class - contract
public abstract class Mobile {
	static final int NOOFDIGITS = 10;
	//int noOfHoursToCharge = 2;
	
	public Mobile() {
		System.out.println("Mobile constructor invoked!!");
	}

	// abstract method - incomplete method
	public abstract String doRepair();
	public abstract String doAddDisplay();
	
	//Concrete method - complete method
	public String greetMessage() {
		return "Hi, Happy to use the mobiles.. becautions..";
	}
}
