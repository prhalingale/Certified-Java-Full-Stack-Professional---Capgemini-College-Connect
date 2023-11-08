package com.edu.operators;

import java.util.Scanner;

class CheckNum{
	int num;
	
	void inputData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num:");
		num=sc.nextInt();
	}
	
	void displayResult() {
		if(num==0) {
			System.out.println(num+ "neither +ve nor -ve it is Zero");
		}else {
		if(num>0) {
			System.out.println(num+ "is positive");
		}else {
			System.out.println(num+ "is negative");
		}
	}
}
}

public class NegativePositive {

	public static void main(String[] args) {
		CheckNum c= new CheckNum();
		c.inputData();
		c.displayResult();
		

	}

}
