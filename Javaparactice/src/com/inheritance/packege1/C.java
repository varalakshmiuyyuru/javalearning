package com.inheritance.packege1;

public class C extends A {
//reducing the visibility from public to protected.
	@Override
	//protected void method1(){
	public void method1() {
		System.out.println("Class C-public method overridden");
		
	}
	
	
	@Override
	//void method3() {
	public void method3() {
		System.out.println("class A- no modifier");
	}
	
}
