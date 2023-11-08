package com.edu.abstraction;



interface MyInterface1{
	
	int k =10; //public static and final
	void m1(); //public abstract void m1();
	
	
}

class MyClass implements MyInterface1{

	@Override
	 public void m1() {
		//k=k+1;
		System.out.println("Interface method "+k);
		
	}
	
}
public class MyInterface {

	public static void main(String[] args) {
		//MyInterface1 mob = new MyInterface1(); //error we cannot instantiate interface
		MyInterface1 mob = new MyClass();
		
		MyClass mob1 = new MyClass();
		mob1.m1();
	
	}

}

