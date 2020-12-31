package com.accenture.lkm.oop.exceptions;

import java.util.Calendar;

/**
 * 
 * @author r.kumar.jagarlapudi
 * Handling the exceptions in java way
 * Exception - API
 *
 */
public class Demo9 {
public static void main(String[] args) {
		
		try {
			getAccess();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		 catch (Exception e) {
			 System.out.println("exception message is "+e.getMessage());
		} finally {
			System.out.println("Hey, after try block");
		}
		
		System.out.println("program execution continues...");
	}

	  public static void getAccess() throws IllegalAccessException,ArithmeticException
		{
			if(Calendar.DAY_OF_MONTH==1)
				System.out.println("salary day..you are allowed");
			else if(Calendar.DAY_OF_MONTH==2)
				throw new IllegalAccessException("Not allowed to access");
			else
				throw new ArithmeticException("hello");
		}
}
