package com.nested_loops;

public class RectangleStar {

	public static void main(String[] args) {
		int r=4, c=4;
		for(int i=1; i<=r; i++) {
			for(int b=1; b<=r-i; b++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
/*123
12
1

333
22
1

   3 3 3
     2 2
       1*/
//https://www.javatpoint.com/how-to-print-pattern-in-java