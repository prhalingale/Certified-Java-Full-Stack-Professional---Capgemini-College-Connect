package com.Conditional;

public class EvenOddSum {

	public static void main(String[] args) {
	  int odd_sum=0,even_sum=0;
      for(int i=1; i<=100; i++) {
    	  if(i%2==0) {
    		  even_sum += i;
    		  
    	  }else {
    		  odd_sum += i;
    		  
    	  }
      }
      
      System.out.println("Sum of Odd num are:"+even_sum);
      System.out.println("Sum of Odd num are:"+odd_sum);
	}

}

