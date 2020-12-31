package com.accenture.lkm.oop.associations;

public class Customer {
	
	private int customerId;
	private String customerName;
	private Account account;
	
	public Customer() {
		System.out.println("Cusotmer constructor invoked!!");
		account = new Account(); //Composition
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
}
