package com.accenture.lkm.oop.abstraction;

public class RealMe extends Mobile {

	@Override
	public String doRepair() {
		return "repair according to RealMe manual";
	}

	@Override
	public String doAddDisplay() {
		return "touch display!!";
	}


}
