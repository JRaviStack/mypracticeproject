package com.accenture.lkm.oop.polymorphism;

public class Mobile  implements MyAdapter, ElectronicGadgets{
	
	@Override
	public void connect() {
		System.out.println("Connecting to mobile");
	}

	@Override
	public void checkPower() {
		System.out.println("before connect check with type & power then connect it");
	}

	@Override
	public void haveWarranty() {
		System.out.println("Max warranty is 6 months");
	}

	@Override
	public void displayProductDetials() {
		System.out.println("This is mobile");
	}
}
