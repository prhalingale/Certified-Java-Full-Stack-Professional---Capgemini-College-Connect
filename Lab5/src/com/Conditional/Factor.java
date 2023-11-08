package com.Conditional;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();
        for(int i=1; i<=n; ++i) {
        	if(n%i==0) {
        		System.out.println(i+ " ");
        	}
        }
	}

}
