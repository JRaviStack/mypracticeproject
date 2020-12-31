package com.accenture.lkm.oop.exceptions;
/**
 * 
 * @author r.kumar.jagarlapudi
 * Handling the exceptions in java way
 * Exception - API
 *
 */
public class Demo5 {

	public static void main(String[] args) {
		Demo5.arrayIndex();
		System.out.println("program continues!!");
	}

	public static int arrayIndex() {
		int myNumArray[] = {1,5,8};
		int element = 0;
		try {
			element =  myNumArray[3];
		}catch(Exception e) {
			System.out.println("exception bcoz of index position: "+e.getMessage());
			e.printStackTrace();
		}
		return element;
	}
}
