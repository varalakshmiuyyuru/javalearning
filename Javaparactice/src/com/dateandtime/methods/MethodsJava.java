package com.dateandtime.methods;

public class MethodsJava {
	public int sum(int x ,int y) {
		return x+y;
	}
	

	public static void main(String[] args) {
		int num1=1000;
		int num2=2000;
		MethodsJava m=new MethodsJava();
		int result=m.sum(num1, num2);
		System.out.println("sum of "+num1+" and "+num2+" is:  "+result);
		int result2=m.sum( result,100);
		System.out.println("after addind 100 to result :" +result2);
		
	}

}
