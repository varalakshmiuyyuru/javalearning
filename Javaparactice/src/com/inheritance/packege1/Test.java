package com.inheritance.packege1;

public class Test {

	public static void main(String[] args) {
		
		//up casting
		Parent p=new Child();
		p.method1();//child class method is accessible when the parent class method is overridden
		//p.doSomething();//child class method is not accessible
		
		
		//DownCasting== object casting ---> assign the parent to child class reference
		Child c=(Child)p;// u need to specify the  class name of the child
		c.method1();
		c.doSomething();
	}

}
