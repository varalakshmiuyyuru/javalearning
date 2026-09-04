package com.abstraction;

abstract class PaymentSystem {
	
	int paymentId;
	//constructor with arguments
	PaymentSystem(int paymentId){
		this.paymentId=paymentId;
	}
	
	//pay()-abstract method
	abstract void pay();
	abstract void refund();
	abstract void shoeStatus();
	//showDetails - concrete method
    public void showDetails() {
    	System.out.println("Payment done with id :"+paymentId);
    	
    }
}
