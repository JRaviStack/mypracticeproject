package com.accenture.lkm.oop.arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		//int[] myNumArray1 = {10,20,60}; //compile time 
		int[] myNumArray = new int[3]; //[] - size of the array
		
		myNumArray[0] = 10; //[] - index/position of the array
		myNumArray[1] = 20;
		myNumArray[2] = 60;
		
		System.out.println(myNumArray[2]); // 3rd element
		System.out.println(myNumArray[0]); // 1st element

	}

}
