package com.inheritance;

public class Test {

	public static void main(String[] args) {
		CreditPayment cp=new CreditPayment();
		
		cp.pay();           //Overridden method called
		cp.generateRecipt();//parent method called
		
		System.out.println("  ");
		
		PayCash pc=new PayCash();
		
		pc.pay();          //parent method called
		pc.storeCash();
		pc.generateRecipt();//parent method called
	}
	

}
