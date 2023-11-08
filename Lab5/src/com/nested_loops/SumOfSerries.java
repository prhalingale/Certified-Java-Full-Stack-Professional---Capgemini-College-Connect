package com.nested_loops;

public class SumOfSerries {

	public static void main(String[] args) {
		int n=5;
		double sum=0;
		double factorial = 1;
		
		for(int i=1; i<=n; i++) {
			factorial *= i;
			sum += i/factorial;
			
		}
		System.out.println("Sum of series:" +sum);

	}

}
