package com.accenture.lkm.oop.arrays;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sizeOfTheArray = 0;
		System.out.println("Enter your size of the array");
		sizeOfTheArray = sc.nextInt();
		
		int[] myNumArray = new int[sizeOfTheArray]; 
		//int myNumArray[] = new int[sizeOfTheArray];
		
		System.out.println("Enter the "+sizeOfTheArray+" elements");
		for (int i = 0; i < myNumArray.length; i++) {
			myNumArray[i] = sc.nextInt();
		}
		
		System.out.println("==for loop==");
		System.out.println("Given array elements are:");
		for (int i = 0; i < myNumArray.length; i++) {
			System.out.println(myNumArray[i]);
		}
		
		System.out.println("size of the array: "+myNumArray.length);
		
		System.out.println("==Advanced loop==");
		System.out.println("Given array elements are:");
		for (int element : myNumArray) {
			System.out.println(element);
		}
	}

}
