package com.abstraction;

public class CGPaymentSystem extends PaymentSystem{
	String userName;
	double amount;
	
	CGPaymentSystem(int paymentId,String userName,double amount) {
		super(paymentId);
		this.userName=userName;
		this.amount=amount;
		
	}

	@Override
	void pay() {
		System.out.println("Paying using CGpayment system");
		
	}

	@Override
	void refund() {
		System.out.println("Refund initiated");
		
	}

	@Override
	void shoeStatus() {
		System.out.println("Payment being process ");
		
	}
    
	

	
}
