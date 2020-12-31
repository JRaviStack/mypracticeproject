package com.accenture.lkm.oop.exceptions;
/**
 * 
 * @author r.kumar.jagarlapudi
 * Handling the exceptions in java way
 * Exception - API
 *
 */
public class Demo4 {

	public static void main(String[] args) {
		System.out.println(Demo4.divide(20,0));
		System.out.println("program terminates!!");
	}

	public static int divide(int num1, int num2) {
		int result=0;
		try {
			result = num1/num2;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
