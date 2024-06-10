package com.tutorialsninja.qa.testcases;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3*1=3	
		//int n=4;
		
		String originalStr = "Hello";
	    String reversedStr = "";
	    System.out.println("Original string: " + originalStr);
	        
	    for (int i = 0; i < originalStr.length(); i++) {
	      reversedStr = originalStr.charAt(i) + reversedStr;
	      }
	    
	    System.out.println("Reversed string: "+ reversedStr);			
	}

}
