package com.corejava.threads.producerconsumer;

public class VolatileDemo {

	public static void main(String[] args) {
		int num=10;
	
	
//	String name="varalakshmi";
//		name.charAt(0);
		Integer intObj=Integer.valueOf(num);
		
		System.out.println(intObj.toString());
		String myString=intObj.toString();
		System.out.println(intObj.toString());
		Double doubleval=intObj.doubleValue();
		System.out.println(intObj.doubleValue());

	}

}
