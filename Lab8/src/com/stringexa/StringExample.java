package com.stringexa;

public class StringExample {

	public static void main(String[] args) {
		String str="123456";
		String str1="";
		for(int i=str.length()-1; i>=0; i--) {
			str1 += str1.charAt(i);
		}
		System.out.print(str1);

	}

}
