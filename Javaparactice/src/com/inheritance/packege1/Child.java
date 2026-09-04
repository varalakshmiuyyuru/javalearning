package com.inheritance.packege1;

public class Child extends Parent{
	public void doSomething() {
		System.out.println("child 1-do something");
	}
	@Override
	public void method1() {
		 System.out.println("Parent -method1 in child method ");
	 }
	

}
