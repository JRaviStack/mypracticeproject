package com.accenture.lkm.oop.exceptions;
/**
 * 
 * @author r.kumar.jagarlapudi
 * Handling the exceptions in java way
 * Exception - API
 *
 */
public class Demo7 {

	public static void main(String[] args) {
		try{
			Demo7.divide(20,0);
		} catch(ArithmeticException ae) {
			System.out.println("exception bcoz: "+ae.getMessage());
		}
		System.out.println("program terminates!!");
	}

	//Propagating the exception to the calling method
	public static int divide(int num1, int num2) throws ArithmeticException {
		int result=0;
		result = num1/num2;
		return result;
	}
}
