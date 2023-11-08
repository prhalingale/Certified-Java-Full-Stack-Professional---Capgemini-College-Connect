package com.array;

import java.util.Scanner;

public class AddEleFirst {

	public static void main(String[] args) {
		int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int size = sc.nextInt();
		a= new int[size+1];
		System.out.println("Enter array "+size+" elements");
		for(int i=0; i<size; i++) {
		a[i]=sc.nextInt();
		
		}
		System.out.println("Enter element to be added at first:");
		int num=sc.nextInt();
		
		for(int i=size-1; i>=0; i--) {
			a[i+1]=a[i];
			//System.out.println(a[i]);
			}
		a[0] = num;
		System.out.println("Array after ele adding at first:");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
//Arrays.sort(a);
		
		//System.out.println("Second largest element "+a[a.length-2]);
	}

}
