package com.methods;

import java.util.Scanner;

public class ArithmeticOperetions {
public void add(int a,int b) {
	System.out.println("sum of two numbers : "+(a+b));
	//return a+b
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a=sc.nextInt();
		System.out.println("Enter the second number : ");
		int b=sc.nextInt();
		ArithmeticOperetions ao=new ArithmeticOperetions();
		ao.add(a, b);
	}
//public void Marks(String name,int mark1,int mark2) {
//
//	System.out.println("sum of two numbers : "+(mark1+mark2));
//	System.out.println("add method complited.");
//	
//}
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter student name : ");
//	    String name=sc.nextLine();
//	System.out.println("Enter student mark1 : ");
//		int mark1=sc.nextInt();
//		System.out.println("Enter student mark2: ");
//	     int mark2=sc.nextInt();
//	ArithmeticOperetions sm=new ArithmeticOperetions();
//	sm.Marks(name, mark1, mark2);
//	System.out.println("inmain method ");
//	System.out.println("mark1: "+mark1);
//	System.out.println("mark2 : "+mark2);
//	System.out.println("name: "+name);
	

}
