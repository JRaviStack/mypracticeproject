package com.accenture.lkm.oop.mystrings;

public class Demo2Immutability {

	public static void main(String[] args) {

		//String is immutable - cannot be modified/mutated
		String s1 = new String("Java");// constructor 
		System.out.println(s1.concat(" is easy"));
		System.out.println("S1: " + Integer.toHexString(System.identityHashCode(s1)));
		s1 = s1.concat(" is easy");
		System.out.println(s1);
		System.out.println("S1: " + Integer.toHexString(System.identityHashCode(s1)));
	
	}

}
