package com.corejava.methods.types;

public class Student{

	public void register(String name) {
		System.out.println(name);
	}
	
	public void register(String name, int age, char gender )
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		
	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.register("Raj");
	     student.register("Raj",20,'M');
	}
}
