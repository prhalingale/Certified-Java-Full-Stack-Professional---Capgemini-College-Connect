package com.loops;

import java.util.Scanner;

public class SwitchOddEven {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num:");
		num=sc.nextInt();
		
		switch(num%2) {
	    case 0:System.out.println(num+" Even Number"); 
		break;
		case 1:System.out.println(num+" Odd number");
		break;
		default:System.out.println("Invalid");
		}
		//www.javainsimpleway.com

	}

}
