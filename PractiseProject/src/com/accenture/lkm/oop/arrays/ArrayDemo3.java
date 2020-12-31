package com.accenture.lkm.oop.arrays;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sizeOfTheArray = 0;
		System.out.println("Enter your size of the array");
		sizeOfTheArray = sc.nextInt();
		//single dimenstional arrays
		int[] myNumArray = new int[sizeOfTheArray]; 
		
		System.out.println("Enter the "+sizeOfTheArray+" elements");
		for (int i = 0; i < myNumArray.length; i++) {
			myNumArray[i] = sc.nextInt();
		}
		
		System.out.println("==for loop==");
		System.out.println("Given array elements are:");
		for (int i = 0; i < myNumArray.length; i++) {
			System.out.println("array element at position: "+i+", value is: "+myNumArray[i]);
		}
		
	}

}
