package com.Conditional;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		
		//Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Enter number");
		//num = scanner.nextInt();
		System.out.println("All Armstrong num between 1 to 1000");
		for(int i=1; i<=1000; i++) {
		int num=i,d,result=0, n=0;
		int orgnum = num;
		
		
		
		while(num>0) {
			n++;
			num = num/10;
		}
		
		
		num = orgnum;
		
		while(num>0) {  //123>0
			d = num%10; //123%10=3
			result = (int) (result+Math.pow(d, n));
			num = num/10;
		}
		
		if(orgnum == result)
			//System.out.println(orgnum+" is Armstrong num");
			System.out.println(orgnum+"");
		//else
			//System.out.println(orgnum+" is not Armstrong num");

	}
	}


	}


