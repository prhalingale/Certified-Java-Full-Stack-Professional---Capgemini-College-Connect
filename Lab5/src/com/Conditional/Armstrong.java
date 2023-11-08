package com.Conditional;


import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
	 int r, result=0;	
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter num");
     int n=sc.nextInt();
     int temp=n;
     for(int i=1; i<=100; i++) {
     while(temp!=0) {
    	 r=temp%10;
    	 result += r*r*r;
    	 temp /= 10;
     }
     if(n==result) {
    	 System.out.println(n+" is Armstrong");
     }else {
    	 System.out.println(n+" is not Armstrong");
     }
     
	}
     }
	// print last 3 prime num from 1 to 100
	

}
