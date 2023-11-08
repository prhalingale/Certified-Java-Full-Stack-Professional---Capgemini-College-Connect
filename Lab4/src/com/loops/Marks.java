package com.loops;

import java.util.Scanner;

class CheckMarks{
	char grade;

	void inputData() {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter Grades:");
	grade=sc.next().toUpperCase().charAt(0);
	}
	void displayGrade() {
		
	    if(grade=='A') {
			System.out.println("Your marks in between 80 to 100");
		}else if(grade=='B') {
			System.out.println("Your marks in between 60 to 79");
		}else if(grade=='C') {
			System.out.println("Your marks in between 40 to 59");
		}else if(grade=='F') {
			System.out.println("Your marks in between 0 to 39");
		}else {
			System.out.println("Invalid input");
		}
}
}
    
public class Marks {

	public static void main(String[] args) {
		
		CheckMarks c= new CheckMarks();
		c.inputData();
		c.displayGrade();
		}
}
