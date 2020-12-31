package com.accenture.lkm.oop.mystrings;

public class Demo5Comparision {

	public static void main(String[] args) {

		String s1 = new String("Java");
		String s2 = new String("Java");
		
		System.out.println("S1: " + Integer.toHexString(System.identityHashCode(s1)));
		System.out.println("S2: " + Integer.toHexString(System.identityHashCode(s2)));
		
		if(s1.equals(s2)) //boolean
		{
			System.out.println("Both strings are equal");
		} else {
			System.out.println("Both strings are not equal");
		}
	
	}

}
