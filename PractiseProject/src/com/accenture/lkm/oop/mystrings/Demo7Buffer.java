package com.accenture.lkm.oop.mystrings;

public class Demo7Buffer {

	public static void main(String[] args) {

		// StringBuffer is mutable and thread safe
		StringBuffer s1 = new StringBuffer("Java"); 
		System.out.println(s1.append(" is easy!!"));
		System.out.println("S1: " + Integer.toHexString(System.identityHashCode(s1)));
		s1 = s1.append(" is easy!!");
		System.out.println("S1: " + Integer.toHexString(System.identityHashCode(s1)));
	}

}
