package com.accenture.lkm.oop;

import java.util.Scanner;

public class DemoFactorial {
	
	public int factorial(int number) { //args/parameter
		Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        number=in.nextInt();
		int fact=1,i=number;
        do {
        	System.out.println(i+" *");
        	fact=fact*i;
            i--;
        }  
        while(i>1);
        in.close();
		return fact;
		
	}
	
	
	public static void main(String[] args) {
		int number = 0; //local variable
        DemoFactorial df = new DemoFactorial();
        int factValue = df.factorial(number); //Invoking the method
        System.out.println(factValue);
    }

}
