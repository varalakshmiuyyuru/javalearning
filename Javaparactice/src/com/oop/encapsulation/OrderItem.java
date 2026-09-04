package com.oop.encapsulation;

public class OrderItem {
	String productname;
	int  quantity;
	double cost;
	public OrderItem(String productname,int  quantity,double cost) {
		this.productname=productname;
		this.quantity=quantity;
		this.cost=cost;
		
		
	}
	public void displayItemDetails() {
		System.out.println("product : "+productname);
		System.out.println("Quantity : "+quantity);
		System.out.println("price : "+cost);
	}

}
