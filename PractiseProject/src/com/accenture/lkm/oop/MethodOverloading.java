package com.accenture.lkm.oop;

public class MethodOverloading {

	public double calculateAddition(double num1, double num2) {
		System.out.println("1");
		double total  = num1+num2;
		return total;
	}
	
	//Type promotion
	public double calculateAddition(float num2,double num1 ) {
		System.out.println("2");
		double total  = num1+num2;
		return total;
	}
	
	public double calculateAddition(double num1, double num2, double num3) {
		double total  = num1+num2+num3;
		return total;
	}
	
	
	public String calculateAddition(String a, String b) {
		String concatValue  = a.concat(b);
		return concatValue;
	}
	
	
	public static void main(String[] args) {
	MethodOverloading mo = new MethodOverloading();
	System.out.println(mo.calculateAddition(10, 20));
	System.out.println(mo.calculateAddition(10, 20.5f));
	System.out.println(mo.calculateAddition(10, 20,30));
	System.out.println(mo.calculateAddition("Java"," is easy!!"));
	
	}

}
