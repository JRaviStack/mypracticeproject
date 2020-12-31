package com.accenture.lkm.oop.polymorphism;

public class MyAdapterTester {

	public static void main(String[] args) {
		System.out.println("== Dell ==");
		DellLaptop dell = new DellLaptop();
		dell.displayProductDetials();
		dell.connect();
		dell.checkPower();
		System.out.println("== Mobile ==");
		Mobile mobile = new Mobile();
		mobile.displayProductDetials();
		mobile.checkPower();
		mobile.connect();
		

	}

}
