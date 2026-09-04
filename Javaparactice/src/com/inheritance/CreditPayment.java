package com.inheritance;

public class CreditPayment extends Payment {
	@override
	public void pay() {
		System.out.println("Credit Payment to merchant");
	}

}
