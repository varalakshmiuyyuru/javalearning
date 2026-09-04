package com.oop.encapsulation;

public class BankDemo {

	public static void main(String[] args) {
	BankAccount ac=new BankAccount(100.00);
	
	double balance=ac.getBalence();
	System.out.println(balance);
	
	ac.setBalance(5000.00);
	
	System.out.println(ac.getBalence());
	
	ac.setBalance(-10000);
	
	ac.getBalence();
	System.out.println(ac.getBalence());

	}
}