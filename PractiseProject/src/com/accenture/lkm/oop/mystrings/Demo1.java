package com.accenture.lkm.oop.mystrings;

public class Demo1 {

	public static void main(String[] args) {

		String s1 = new String("Java");// constructor 
		System.out.println(s1);
		System.out.println("S1: " + Integer.toHexString(System.identityHashCode(s1)));

		String s2 = new String("Ravi");
		System.out.println(s2);
		System.out.println("S2: " + Integer.toHexString(System.identityHashCode(s2)));

		String s4 = new String("Java");
		System.out.println(s4);
		System.out.println("S4: " + Integer.toHexString(System.identityHashCode(s4)));

		String s3 = "LKM"; // String literal
		System.out.println(s3);
		System.out.println("S3: " + Integer.toHexString(System.identityHashCode(s3)));

		String s5 = "LKM"; // String literal
		System.out.println(s5);
		System.out.println("S5: " + Integer.toHexString(System.identityHashCode(s5)));
	
	}

}
