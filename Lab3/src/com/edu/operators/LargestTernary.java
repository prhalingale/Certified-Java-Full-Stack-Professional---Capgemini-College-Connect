package com.edu.operators;

import java.util.Scanner;

public class LargestTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,l,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 4 num:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        //d=sc.nextInt();
        l=(a>b && a>c)?a:(b>a && b>c)?b:c;
        
        //l=(a>b && a>c)?a: (b>a && b>c)?b:c; for 3 num
        //l=(a>b && a>c && a>d)?a:(b>a && b>c && b>d)?b:(c>a && c>b &&c>d)?c:d;
        System.out.println("largest of 4 num is: "+l);

	}

}

