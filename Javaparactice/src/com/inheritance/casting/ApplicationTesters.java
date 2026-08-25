package com.inheritance.casting;

public class ApplicationTesters extends Employee {
	public  ApplicationTesters(String name) {
		super(name);
	}
	public void work() {
		System.out.println(name+" is testing application");
		
	}
	public void testApplication() {
		System.out.println(name +" is tsting application for bugs");
	}

}
