package com.accenture.lkm.oop.mystrings;

public class Demo8Builder {

	public static void main(String[] args) {

		// StringBuilder is mutable and not thread safe
		StringBuilder s1 = new StringBuilder("Java"); 
		System.out.println(s1.append(" is easy!!"));
		System.out.println("S1: " + Integer.toHexString(System.identityHashCode(s1)));
		s1 = s1.append(" is easy!!");
		System.out.println("S1: " + Integer.toHexString(System.identityHashCode(s1)));
	}

}
