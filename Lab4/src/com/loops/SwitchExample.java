package com.loops;

import java.util.Scanner;

class Calculator{
	double a, b, ans;
	static Scanner sc= new Scanner(System.in);
	void inputData() {
		
		System.out.println("enter 2 num");
		a=sc.nextDouble();
		b=sc.nextDouble();
	}
	void addition() {
		ans=a+b;
		System.out.println("Sum of "+a+ " and "+b+" is "+ans);
	}
	void substraction() {
		ans=a-b;
		System.out.println("Difference of "+a+ " and "+b+" is "+ans);
	}
	void multiplication() {
		ans=a*b;
		System.out.println("Multiplication of "+a+ " and "+b+" is "+ans);
		
	}
	void division() {
		if(b==0) {
			System.err.println("Divide by Zero error");
		}else {
		ans=a/b;
		System.out.println("Division of "+a+ " and "+b+" is "+ans);
		}	
	}
}
public class SwitchExample {

	public static void main(String[] args) {
		
		Calculator cal= new Calculator();
		cal.inputData();
		
		System.out.println("******Menu********");
		System.out.println("Enter your choice:");
		System.out.println("1.Addition");
		System.out.println("2.Substration");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		int choice = Calculator.sc.nextInt();
		
		switch(choice) {
		case 1: cal.addition();
		break;
		case 2: cal.substraction();
		break;
		case 3: cal.multiplication();
		break;
		case 4: cal.division();
		break;
		default: System.out.println("Invalid");
		}
		
	}

}
