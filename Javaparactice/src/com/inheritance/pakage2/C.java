package com.inheritance.pakage2;

import com.inheritance.packege1.A;

public class C extends A{

	public static void main(String[] args) {
		A a=new A();
		
         a.method1();
         //a.method2(); ---- private method
         //a.method3();------ no modifier
         //a.method4();------protected method 
         C c=new C() ;
         c.method1();//--------allows because public method of class A
          //a.method2(); ---- not accessabile because method2() is private method of class A
         //a.method3();------ not accessible because method2() is no accesses modifier  method of class A
         
         c.method4();// ---- Accessible 
         
        	 
         
	}

}
