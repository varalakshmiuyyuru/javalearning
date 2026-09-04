package com.inheritance.casting;

public class Manager extends Employee {
	public Manager(String name) {
		super(name);
		
	}
	public void work() {
		System.out.println(name+" is managing the team ");
	}
	public void meeting() {
		System.out.println(name+" condecting meetings");
	}

}
