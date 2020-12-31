package com.accenture.lkm.oop.exceptions;
/**
 * 
 * @author r.kumar.jagarlapudi
 * Handling the exceptions in java way
 * Exception - API
 *
 */
public class Demo3 {

	public static void main(String[] args) {
		//Exception exception = new Exception();
		System.out.println(Demo3.divide(20,0));
		System.out.println("program terminates!!");
	}

	public static int divide(int num1, int num2) {
		int result=0;
		try {
			result = num1/num2;
		}catch(Exception e) {
			System.out.println("Buddy, Your deminator is zero...");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return result;
	}
}
