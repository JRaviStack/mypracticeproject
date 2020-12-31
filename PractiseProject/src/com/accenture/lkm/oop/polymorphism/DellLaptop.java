package com.accenture.lkm.oop.polymorphism;

public class DellLaptop implements MyAdapter, ElectronicGadgets {

	@Override
	public void connect() {
		System.out.println("Connecting to laptop");
	}

	@Override
	public void checkPower() {
		System.out.println("before connect check with watts then connect it");
	}

	@Override
	public void haveWarranty() {
		System.out.println("max warranty : 1 Year");
	}

	@Override
	public void displayProductDetials() {
		System.out.println("THis is laptop");
	}

}
