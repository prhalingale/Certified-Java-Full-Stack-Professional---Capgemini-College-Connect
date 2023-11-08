package com.edu.operators;

import java.util.Scanner;

class ElectricBill{
	String n;
	int units;
	double bill;
	
	void accept() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Name:");
		n=sc.next();
		System.out.println("Enter num of units consumed:");
		units=sc.nextInt();
		
	}
	
	void Calculate() {
		
		if(units>0 && units<=100) {
			bill= units*2.00;
		}else if(units > 100 && units <=300) {
			bill= 100*2 +(units-100)*3.00f;
		}else if(units>300){
			bill =100*2.00f+200*3+(units-300)*5.00f*0.025;
			
		
		}
	}
	void displayResult() {
		System.out.println("Name:" +n);
		System.out.println("units:" +units);
		System.out.println("Bill amount is:" +bill);
	}
}
   
public class ElectricityBill {
	

	public static void main(String[] args) {
		ElectricBill eb= new ElectricBill();
		eb.accept();
		eb.Calculate();
		eb.displayResult();
	}

}
