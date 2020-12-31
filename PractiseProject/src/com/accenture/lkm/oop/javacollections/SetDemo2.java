package com.accenture.lkm.oop.javacollections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) {
		//Polymorphism
		//generics
		Set<String> set1 = new HashSet<String>();
		//Set<Integer> set2 = new HashSet<Integer>();
		System.out.println(" is my Set1 is empty? "+set1.isEmpty());
		//set1.add(100);
		set1.add("Ravi");
		set1.add("Krishna");
		//set1.add(105.26);
		set1.add(null);  //set not allow duplicates
		//set1.add("Krishna");
		//set1.add(null); // only one null element
		System.out.println(" is my Set1 is empty? "+set1.isEmpty());
		System.out.println(set1);
		System.out.println("Size of set1: "+set1.size());
		System.out.println("==Iterating using for-each==");
		for (String string : set1) {
			System.out.println(string);
		}
		System.out.println("==Iterating using Iterator==");
		 Iterator<String> itr = set1.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		
		 set1.remove("Ravi");
		 System.out.println(set1);
		 
		 Set<String> set2 = new HashSet<String>();
		 Collections.addAll(set2, "Ravi","Krishna","Mohan");
		 if(set2.size() != 0 ){
			 System.out.println(set2);
		 } else {
			 System.out.println("hey, your set is empty!!");
		 }
		 
		 if(!(set2.isEmpty())){
			 System.out.println(set2);
		 } else {
			 System.out.println("hey, your set is empty!!");
		 }
		
		//set charectersitic/behavior
		
		
		
		

	}

}
