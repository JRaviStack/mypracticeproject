package com.accenture.lkm.oop.arrays;

import java.util.Scanner;

public class ArrayDemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rowSize = 0;
		int colSize = 0;
		System.out.println("Enter your no of rows and cols of the array");
		rowSize = sc.nextInt();
		colSize = sc.nextInt();
		
		//two dimensional arrays
		int[][] myNumArray = new int[rowSize][colSize]; 
		
		System.out.println("Enter the rows:"+rowSize+ " columns: "+colSize+" of the array");
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				myNumArray[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("given array elements");
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				System.out.println(myNumArray[i][j]);
			}
		}
		
	}

}
