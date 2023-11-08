package com.edu.abstraction;


//Abstract: If any one method make class is also abstract
//Can cannot create an object of abstract class
//can have constructor, instance variables, normal methods
//Abstract class have abstract as well as non abstract method
//Abstract class can have all non abstract methods also 
//but we can class can be abstract
//when we dont want object object to be created we go for abstract class


abstract class AreaFigure{
	
	abstract void area();
	
	void display() {
		System.out.println("Display method of abstract class");
	}
}
class Reactangle extends AreaFigure{
	
	void area() {
		int l=8;
		int b=9;
		int a = l*b;
		System.out.println("Area of Reactangle="+a);
	}
	
}
class Square extends AreaFigure{
	
	void area() {
		int l=8;
		
		int a = l*l;
		System.out.println("Area of Square="+a);
	}
	
}
public class AreaFigures{

	public static void main(String[] args) {
	//	AreaFigures aob = new AreaFigures();  //we cannot create an object for abstract class
		Reactangle rob = new Reactangle();
		rob.area();
		
		Square sob = new Square();
		sob.area();
	
	}

}	
