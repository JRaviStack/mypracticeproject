package com.accenture.lkm.oop.javacollections;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {

	public static void main(String[] args) {
		Set<String> set1 = new TreeSet<String>();
		set1.add("Ravi");
		set1.add("Krishna");
		//set1.add(null); // TreeSet not accept null elements
		set1.add("Sachin");
		set1.add("Vaibhav");
		set1.add("Arun");
		System.out.println(set1);
	}

}
