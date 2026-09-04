package com.inheritance;
//ConsructorOverloading
public class Employee {
	int id;
	String name;
	String compenyName;
	double salary;
	
	//explicitly creating a constructor
	public Employee() {
		
	}
	//constructor with parameters
	public  Employee(int id,String name,String compenyName,double salary ) {
		this.id=id;
		this.name=name;
		this.compenyName=compenyName;
		this.salary=salary;
		
	}
	
	public void getEmployeeDetails() {
		System.out.println("Employee Details : ");
	}
	public void calculateSalary() {
		System.out.println("employee salary :");
		
	}
}
