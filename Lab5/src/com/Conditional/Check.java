package com.Conditional;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       for(int i=1; i<=3; i++) {
    	 for(int j=2; j>=i; j--) {
    		 System.out.print(" ");
    	 }
    	 for(int k=1; k<=i;k++) {
    		 System.out.print(i+" ");
    	 }
    	 System.out.println();
       }
       
	}

}
