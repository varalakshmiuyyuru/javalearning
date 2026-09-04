package com.corejava.controlflow.forloop;


// Program to demonstrate recursion  for finding the factorial of a given number
public class Factorial {
	
	public static int factorial(int n) {
		
		// Base condition
		if(n==0 || n==1) {
			//System.out.println();
			return 1; 
		}

       //REcursive call
		   int result =  n*factorial(n-1);
		   return result; 
	
	}

	public static void main(String[] args) {
		
		int num =5;
		
		int result = factorial(num);
	    System.out.println(result);
	
		
		
		
	}
	
	
}
