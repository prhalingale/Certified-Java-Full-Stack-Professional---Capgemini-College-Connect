package com.Conditional;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		
		/*for(int j=2; j<=11; j++) { //print prime num bet 1 to 100
		   int temp=0;
		   for(int i=2; i<=j-1; i++) {
			   if(j%i==0) {
				   temp++;
			}
		}
		   if(temp==0) {
			System.out.println(j);
		}
		}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int n=sc.nextInt();
		int temp=0;
		for(int i=1; i<=n/2; i++) {
			if(n%2==0) {
				temp++;
			}
		}if(temp>0) {
			System.out.println(n+" is not prime num");
		}else {
			System.out.println(n+" is prime num");
		}
		
	}

}
