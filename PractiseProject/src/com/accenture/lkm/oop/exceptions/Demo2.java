package com.accenture.lkm.oop.exceptions;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println(Demo2.divide(20,0));
		System.out.println("program terminates!!");
	}

	public static int divide(int num1, int num2) {
		if(num2 == 0) { // programatically handling the condition
			return -1;
		}
		return num1/num2;
	}
}
