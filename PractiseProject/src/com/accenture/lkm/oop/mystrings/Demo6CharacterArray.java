package com.accenture.lkm.oop.mystrings;

public class Demo6CharacterArray {

	public static void main(String[] args) {

		String s1 = new String("Java");// constructor 
		System.out.println(s1);
		
		Character[] myCharArray = new Character[s1.length()];	
		for (int i = 0; i < myCharArray.length; i++) {
			myCharArray[i] = s1.charAt(i);
			System.out.println("Position: "+i+" character: "+myCharArray[i]);
		}
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());  
		System.out.println(s1.compareTo("Java")); //int
		
		
		//advaced/foreach loop
		
		
	
	}

}
