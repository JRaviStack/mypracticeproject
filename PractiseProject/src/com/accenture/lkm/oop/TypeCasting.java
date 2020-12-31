package com.accenture.lkm.oop;

import java.time.Year;

public class TypeCasting {
	
	public static void main(String[] args) {
		/*
		 * int myNum1 = 20; double myNum2 = 30.7;
		 * 
		 * //myNum2 = myNum1; // Type promoted
		 * 
		 * myNum1= (int)myNum2; //Type casting - loss of data
		 * System.out.println(myNum1);
		 */
		
		System.out.println(Year.of(2016).length());
		
	}
}
