package com.edu.operators;

import java.util.Scanner;

class Check{
	int n1,n2;
	
	void inputData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num:");
		n1=sc.nextInt();
		n2=sc.nextInt();
	}
	
	void displayResult() {
		if(n1>n2) {
			System.out.println(n1+" is greater");
		}else {
			System.out.println(n2+" is greater");
		}
	}
}
public class LargestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c= new Check();
	    c.inputData();
	    c.displayResult();
	}

}
