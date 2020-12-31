package com.accenture.lkm.oop.associations;

public class AssociationClient {
	
	public static void main(String[] args) {
		Customer c1 = new Customer(); 
		System.out.println(c1.getAccount().getAccountId());
		
		Customer c2 = new Customer(); 
		System.out.println(c1.getAccount().getAccountId());
	}
}
