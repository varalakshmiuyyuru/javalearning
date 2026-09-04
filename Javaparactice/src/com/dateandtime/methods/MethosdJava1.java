package com.dateandtime.methods;

public class MethosdJava1 {
	public int multiply(int x,int y) {
		return x*y;
	}
	public String displayDetails(String name,int age) {
		String text="welcome "+ name+ "! " +"your age is "+age;
		return text;
	}

	public static void main(String[] args) {
		
		MethosdJava1 m=new  MethosdJava1();
		String name="Kalpana Bathula";
		int age=20;
		//invoke displayDetails 
		String result1=m.displayDetails( name, age);
		System.out.println(result1);
	}

}
