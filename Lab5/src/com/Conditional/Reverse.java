package com.Conditional;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int n, rem, rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		n=sc.nextInt();
		while(n!=0) {
		rem=n%10;
		rev=10*rev +rem;
		n=n/10;
		}
	 System.out.println(rev);
}
}
