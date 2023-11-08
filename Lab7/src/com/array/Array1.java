package com.array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		//int a[] = new int[5];
		int a[]; //default values of array 0
		int size;
		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		Scanner scanner = new Scanner(System.in);
		//input array elements
		
		System.out.println("Enter size of an Array");
		size = scanner.nextInt();
		a=new int[size];
		
		System.out.println("Enter "+a.length+" elements");
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}
		
		//Display
		System.out.println("Array elements are ");
		//for(int i =0; i<a.length;i++) {
		for(int i:a) { //for each
			//System.out.println(a[i]);
			System.out.println(i);
		}
		
		//sum of array ele.
		int sum=0;
		for(int i:a) {
			sum = sum+i;
		}
		System.out.println("sum: "+sum);
		float avg = 0;
		avg = (float)sum/a.length;
		System.out.println("Average: "+avg);
		
		//Maximum num
		int max=a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Largest elements is:"+max);
		
		//Search element in array(Linear search)
		
		System.out.println("Enetr element to search:");
		int key= scanner.nextInt();
		int pos=0;
		for(int i=0; i<a.length; i++) {
			if(key == a[i]) {
				pos += i;
				break;
			}
		}
		if(pos > 0) {
			System.out.println("element found at Location: "+(pos+1));
		}else {
			System.out.println("Element is not Found");
		}
    }


}
        
	

