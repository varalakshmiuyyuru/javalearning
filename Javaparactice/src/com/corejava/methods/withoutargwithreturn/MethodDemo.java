package com.corejava.methods.withoutargwithreturn;

// Program demonstrating a method without argument and with return type
public class MethodDemo {
	
	// non-static or instance method
	public int getStudentCount() {
		
		return 200;
		
	}
	
	public String getGreeting() {
		
		return "Hello";
	}
	
	public static void main(String[] args) {
		
		MethodDemo m = new MethodDemo();
		
		int studentCount = m.getStudentCount();
		System.out.println(studentCount);
		
		String greeting = m.getGreeting();
		System.out.println(greeting);
		
	}
	

}
