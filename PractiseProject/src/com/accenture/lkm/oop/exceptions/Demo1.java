package com.accenture.lkm.oop.exceptions;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println(Demo1.divide(20,0)); //JVM terminates
	}

	public static int divide(int num1, int num2) {
		return num1/num2;
	}
}
