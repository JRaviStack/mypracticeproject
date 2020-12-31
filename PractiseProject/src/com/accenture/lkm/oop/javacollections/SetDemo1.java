package com.accenture.lkm.oop.javacollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		
		//Polymorphism
		Set set1 = new HashSet();
		System.out.println(" is my Set1 is empty? "+set1.isEmpty());
		set1.add(100);
		set1.add("Ravi");
		set1.add("Krishna");
		set1.add(105.26);
		set1.add(null);
		set1.add("Krishna");
		set1.add(null);
		System.out.println(" is my Set1 is empty? "+set1.isEmpty());
		System.out.println(set1);
		System.out.println("Size of set1: "+set1.size());
		System.out.println("==Iterating using for-each==");
		for (Object object : set1) {
			System.out.println(object);
		}
		
		
		//set charectersitic/behavior
		
		
		
		

	}

}
