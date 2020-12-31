package com.accenture.lkm.oop.abstraction;

public class MobileClient {

	public static void main(String[] args) {
		
		//static binding - static, final 
		RealMe realMe = new RealMe(); //compile time
		//realMe.doRepair();
		
		//Dynamic binding , runtime
		Mobile realMe1 = new RealMe();
		realMe1.doAddDisplay();
		realMe1.doRepair();
		
		Mobile oppo = new Oppo();
		oppo.doAddDisplay();
		oppo.doRepair();

	}

}
