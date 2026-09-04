package com.abstraction;

public class Test {

	public static void main(String[] args) {
		//creating object for the abstract class  : note we Cannot instantiate the type Abstract class
	     //PaymentSystem ps=new PaymentSystem(10);
		
	// creating object for child class 	
     CGPaymentSystem cg=new CGPaymentSystem(100,"raj",100000.00);
     cg.pay();
     cg.refund();
     cg.shoeStatus();
     
		
	}

}
