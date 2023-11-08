package com.array;

public class DiffBlocks {
	static {
	     System.out.println("Static block");	
	}
	DiffBlocks(){
		System.out.println("constructor is called");
	}
	{
		System.out.println("anonymous block");
	}

	public static void main(String[] args) {
		System.out.println("main");
		DiffBlocks obj= new DiffBlocks();
		

	}

}
