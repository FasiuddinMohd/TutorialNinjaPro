package com.tutorialsninja.qa.testcases;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10; // int is a datatype; a is variable; 10 is a value.
		int b=20;
		//arthamatic operations + - * % /
		System.out.println("sum of a and b is "  + (a+b));
		System.out.println("difference between two number " + (b-a));
		System.out.println("multiplication of a and b " + (a*b));
		System.out.println("division of a and b " + (a/b));
		System.out.println("mod div of a and b is " + (a%b));
		
		//Relation Operations / Comparision Operators ---- < > <= >= !=
		
		System.out.println(a==b); //false
		System.out.println(a<b);  // true
		System.out.println(a>b);  // false
		System.out.println(a<=b); // true
		System.out.println(a>=b); // false
		System.out.println(a!=b); //true
		
		// Logical Operations 
		System.out.println("-----------------Logical Operators");
		boolean x=true;
		boolean y=false;
		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true
		
		// incremental or decremental operator
		
		int p=5;
		p=p+1;
		System.out.println("Expected Number " +p);
		p++;
		System.out.println("Expected Number " +p);
		//decremental operator
		p=p-1;
		System.out.println("Expected Number " +p);
		p--;
		System.out.println("Expected Number " +p);
		
		int m =p++;
		System.out.println("Expected Number m = " +m);
		
		
		
		
		
		
		
				
		
	}

}
