package com.Conditional;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num:");
        int n=sc.nextInt();
        int rem, rev=0;
        int temp=n;
        while(temp!=0) {
        	rem=temp%10;
        	rev=10*rev+ rem;
        	temp=temp/10;
        }
        if(rev==n) {
        	System.out.println(n+ " is palindrome");
        }else {
        	System.out.println(n+" is not palindrome");
        }
        
	}

}
