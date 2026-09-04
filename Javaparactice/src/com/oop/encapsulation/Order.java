package com.oop.encapsulation;

public class Order {
int orderId;
String customerName;
OrderItem orderItem;
Order(int orderId,String customerName){
	this.orderId=orderId;
	this.customerName=customerName;
	this.orderItem=orderItem;
	  orderItem =new OrderItem("laptop", 2,1000000.00 );
    
}
public void displayOrder() {
	
	System.out.println("::::customer details ::::");
	System.out.println("order id : "+orderId);
	System.out.println("customer name : "+customerName);
	
	System.out.println("::::order  details ::::");
	System.out.println("order item : "+orderItem.productname);
	System.out.println("quantity : "+orderItem.quantity);
	System.out.println("item price : "+orderItem.cost);
	
}
}
