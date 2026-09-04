package com.oop.encapsulation;
public class BankAccount {
	
       private double balance;
     BankAccount(double balence){
	    this.balance=balence;
}
     
     //Accessors is used to the retrive the data
     //mutators is used to change the value and data
     
   //provide access to get balance 
     
     //getter
     public double getBalence() {
    	 return balance;
    	 
    	 
     }
     //setter method    
     public void setBalance(double balance) {
    	 
    	if(balance>=0) {
    		
    		this.balance=balance;
    	}else {
    		
    		System.out.println("negitive balance cannot be set");
    	}
    	 
     }

}
