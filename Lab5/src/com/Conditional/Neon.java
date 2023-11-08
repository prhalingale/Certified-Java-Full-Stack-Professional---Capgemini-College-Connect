package com.Conditional;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        //System.out.println("Enter num:");
        //int n=sc.nextInt();
        for(int i=1; i<=100; i++) {
        int r, sq=i*i;
        int sum = 0;
        while(sq!=0) {
        	r=sq%10;
        	sum += r;
        	sq=sq/10;
        }
       /* if(sum==n) {
        	System.out.println(n+" is neon num");
        }else {
        	System.out.println(n+" is not neon num");
        }*/
       
        	if(sum==i) {
        		System.out.println(i);
        	}
        }
	}

}
