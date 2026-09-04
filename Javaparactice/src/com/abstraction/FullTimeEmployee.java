package com.abstraction;
public class FullTimeEmployee extends Employee {
	double monthlySalary;
    FullTimeEmployee(int empId, String empName,double monthlySalary) {
		super(empId, empName);
		this.monthlySalary=monthlySalary;		
	}
   @Override
    public double calculateSalary() {
	System.out.println("Full Time Employee salary : " +monthlySalary );
	return monthlySalary;
   }
}
