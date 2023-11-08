package com.nested_loops;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num=123456;
          int n=0;
          /*for(; num>0; num=num/10,n++) {
          }*/
          while(num>0) {
        	  n++;
        	  num=num/10;
          }
          System.out.println(n);
          }
	}


