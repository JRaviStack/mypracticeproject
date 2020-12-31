package com.accenture.lkm.oop.javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		
		List<Integer> myNumList = new ArrayList<Integer>();
		List<Integer> muNumList1  = new  LinkedList<Integer>();
		myNumList.add(1001);
		myNumList.add(1002);
		myNumList.add(1005);
		System.out.println(myNumList);
		Iterator<Integer> itr =  myNumList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Explore
		Iterator<Integer> itr1 =  myNumList.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println(myNumList.contains(1006));
		
		

	}

}
