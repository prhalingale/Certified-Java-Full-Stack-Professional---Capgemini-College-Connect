package com.edu.operators;

public class Increment {

	public static void main(String[] args) {
		int a,b;
		a=10;
		b=10;
		int c=a++ + b++;
		
				
		System.out.println("c=" +c);
		System.out.println("a=" +b);
		System.out.println("b="+(a+b));
		System.out.println((a+b)+"b=");
	}

}
