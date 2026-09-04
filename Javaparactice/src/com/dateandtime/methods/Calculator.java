package com.dateandtime.methods;

public class Calculator {
	public int addTwoIntegers(int a,int b) {
		return a+b;
		
	}
	public int addThreeIntegers(int a,int b,int c) {
		 return a+b+c;
	}
	public static void main(String[] args) {
		 Calculator cal=new  Calculator();
		int r= cal.addTwoIntegers(10,20);
		int r1= cal.addThreeIntegers(10,20,30);
         System.out.println(r);
         System.out.println(r1);
	}

}
