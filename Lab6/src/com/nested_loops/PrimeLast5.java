package com.nested_loops;

public class PrimeLast5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		int counter=0;
		// TODO Auto-generated method stub
		for(int i=100;i>=1;i--) {
			 c=0;
			for(int j=1 ;j<=i;j++ ) {
				if(i%j==0) {
					c++;
				}
				
			}
			if(c==2) {
				counter++;
				System.out.println(i);
				if(counter==5) {
					break;
				}
			}
		}
	}

}
