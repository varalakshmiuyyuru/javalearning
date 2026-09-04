package com.corejava.methods.types;

// Class demonstrating method overloading
public class Calculator {
		
	public void add(int a, String b) {
		
		System.out.println(a+b);
	}
	
   public void add( String y,int x) {
		
		System.out.println(y+x);
	}
   
   public void add(int a, int b, int c) {
	   
	   System.out.println(a+b+c);
   }
   
   public int add(int i, int j) {
	   
	   System.out.println(i+j);
	   return 10;
   }
	
	
 
	
	public static void main(String[] args) {
		
		
		Calculator cal = new Calculator();
		cal.add(10,20);
		
		cal.add(10,20,30);
		
		
		
	}
	
	

}
