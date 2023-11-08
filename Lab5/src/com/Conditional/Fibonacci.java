package com.Conditional;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n1=0,n2=1,n3;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num:");
        int n=sc.nextInt();
        for(int i=1; i<=n; ++i){
        	n3=n1+n2;
        	n1=n2;
        	n2=n3;
        	System.out.print(n1+" ");
        }
        
	}

}
