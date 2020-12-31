package com.accenture.lkm.oop.exceptions;
/**
 * 
 * @author r.kumar.jagarlapudi
 * Handling the exceptions in java way
 * Exception - API
 *
 */
public class Demo8 {

	public static void main(String[] args) {
		try{
			int result = Demo8.divide(20,0);
			System.out.println(result);
		} catch(ArithmeticException ae) {
			System.out.println("exception bcoz: "+ae.getMessage());
		} catch(NullPointerException npe) {
			npe.printStackTrace();
		}
		System.out.println("program terminates!!");
	}

	//Propagating the exception to the calling method
	public static int divide(int num1, int num2) throws ArithmeticException, NullPointerException {
		int result=0;
		String userName = null;
		System.out.println(userName.length());
		result = num1/num2;
		return result;
	}
}
