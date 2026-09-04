package com.inheritance;

public class EmpolyeeInherit extends Employee{
	//public EmpolyeeInherit(int id,String name,String company,double salary) {
    //super() is a call to the super class constructor
		//super(is,name,company,salary)}
	int branchId;
	String branch;
	String location;
	//Constructor 1
	public EmpolyeeInherit(int id,String name,String companyName,double salary) {
		super(id,name,companyName,salary);
		this.location=location;
	}
	//Constructor 2
	public EmpolyeeInherit(int branchId,String branch) {
		super();
		this.branchId=branchId;
		this.branch=branch;
		
	}
	//to print the details of employee what are u need the details 
	public void getDetails() {
		System.out.println(id+" | "+name+"|"+compenyName+" | "+salary+" | "+location);
		
	}
	public void getmore() {
		System.out.println(branchId+" | "+branch);
	}
		
	}
