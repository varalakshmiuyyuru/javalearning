package com.inheritance.casting;

import com.inheritance.override;

public class Developer extends Employee {
	public Developer(String name) {
		super(name);
	}
	@override
	public void work(){
		System.out.println(name+" is developing the application");
	}
	public void writingCode() {
		System.out.println(name+" is writing java code");
	}

}
