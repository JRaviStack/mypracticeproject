package com.accenture.lkm.oop;

public class ContactInfo {
	
	public String addContact(String personName, int mobileNumber ) {
		return personName+", "+mobileNumber;
	}
	
	public String addContact(String personName, long mobileNumber1, long mobileNumber2 ) {
		return personName+", "+mobileNumber1+", "+mobileNumber2;
	}

	public static void main(String[] args) {
		ContactInfo contactInfo = new ContactInfo();
		System.out.println(contactInfo.addContact("Ravi", 1111111111));
		System.out.println(contactInfo.addContact("Suman", 1111111121L,3333333333L));
		
		

	}

}
