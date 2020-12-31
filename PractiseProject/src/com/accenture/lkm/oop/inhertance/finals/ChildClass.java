/**
 * 
 */
package com.accenture.lkm.oop.inhertance.finals;

/**
 * @author r.kumar.jagarlapudi
 *
 */
public class ChildClass extends ParentClass {

	int timer = 10; // instance variable

	public ChildClass() {
		// super();// invoking the parent class constructor
		super(20);
		System.out.println("MyDerived constructor invoked!!");
	}

	/*
	 * public MyDerived() { super(); // invoking the base class constructor } }
	 */
	public void printTheTimer(int timer) { // local/parameter
		System.out.println(super.timer); // super keyword referes to parent class properties/methods/Constrcutors
		System.out.println(timer);
		super.myMethod();
	}
	
	/*
	 * public void myMethod() { System.out.println(" Myderived class method"); }
	 */

}
