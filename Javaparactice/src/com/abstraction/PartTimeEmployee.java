package com.abstraction;

public class PartTimeEmployee extends Employee {
	int hoursWorked;
	double hourlyRate;


	PartTimeEmployee(int empId, String empName,int hoursWorked,double hourlyRate) {
		super(empId, empName);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
		
	}

	@Override
	public double calculateSalary() {
		double salary=hoursWorked*hourlyRate;
		//salary=10*5000;
		System.out.println("PartTimeEmployee salary : "+salary);
		return salary;
	}
	
	

}
