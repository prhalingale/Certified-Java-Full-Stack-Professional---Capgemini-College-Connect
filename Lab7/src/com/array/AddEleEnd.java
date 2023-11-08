package com.array;

import java.util.Scanner;

public class AddEleEnd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array:");
		
		int size=sc.nextInt();
		int a[]= new int[size+1];
		System.out.println("enter "+(a.length-1)+" array elements");
        for(int i=0; i<a.length-1; i++) {
        	a[i]=sc.nextInt();
        }
        System.out.println("enter element to be added at last");
        int num=sc.nextInt();
        a[a.length-1]=num;
        
        //Display array ele
        
        for(int i:a) {
        	System.out.println(i);
        	
        }
	}

}
