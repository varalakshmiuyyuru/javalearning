package com.dateandtime.methods;

public class MethodOverloading {
// Method Overloading is and overriding is also called polimarphisum
	//multiple methods with the same name in the same class,
	//but with different parameters (different number, type, or order of parameters).
		public void add(int a,int b) {
			System.out.println( a+b);
			
		}
		public void add(String x,int y) {
			System.out.println( x+y);
		}
		public void add(int a,int b,int c) {
			System.out.println(a+b+c);
		}
		public void add(int i,double j) {
			System.out.println(i+j);
		}
		public static void main(String[] args) {
			 MethodOverloading cal=new   MethodOverloading();
			cal.add(10,20);
			cal.add("re",20);
			cal.add(1, 10, 40);
			cal.add(10,20.00);
	        

	}

}
