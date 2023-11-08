package com.array;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		int a[] = new int[5];
		
		/*for(int i=0; i<a.length; i++){
			System.out.println(a[i]);	
        
	    }*/
		/*int a[];
		int size;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		a= new int[size];
		}*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter "+a.length+" elements");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array Elements are:");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
/*1. Program to print even position elements of an array

2. Program to print Odd position elements of an array

Ex: 3 5 7 9 1 8
Even Position elements are:  5 9 8
Odd position elements are  : 3 7 1

3. Program insert an element into an array if the position is given
4. Program to delete an element from an array if the postion is given

5. Program find second largest element of an array*/