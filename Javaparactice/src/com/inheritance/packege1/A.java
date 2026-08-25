package com.inheritance.packege1;

public class A {
public void  method1() {
	System.out.println("class a-public ");
	
}
private void method2() {
	System.out.println("class A-private");
}
void method3() {
	System.out.println("class A-default ");
}
protected void method4() {
	System.out.println("class A-Protected ");
}
public static void main(String[]args) {
	A a=new A();
	a.method1();
	a.method2();
	a.method3();
	a.method4();
}
}