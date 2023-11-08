package com.edu.operators;

import java.util.Scanner;

class Checknum1{
	int a,b,c;
	
	void inputData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 3 num:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
	}
	void displayResult() {
		 if( a > b && a > c) {
	            System.out.println(a + " is the largest number.");
		 }
	        else if (b > a && b > c) {
	            System.out.println(b + " is the largest number.");

	        }else {
	            System.out.println(c + " is the largest number.");
         }
	}
}
public class LargestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checknum1 c = new Checknum1();        
		c.inputData();
        c.displayResult();
	}

}
