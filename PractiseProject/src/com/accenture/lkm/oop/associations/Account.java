package com.accenture.lkm.oop.associations;

public class Account {

	private static int accountId;
	private String accountName;
	private String accountType;
	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Account() {
		System.out.println("Account constructor invoked!!");
		accountId++;
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
}
