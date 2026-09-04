package com.dateandtime.methods;

public class CalculateSalary {
	double basic;
	double hra ;
	double commision;
	public CalculateSalary(double basic,double hra ,double commision) {
		this.basic=basic;
		this.hra=hra;
		this.commision=commision;
		
	}
	public double CalculateGrossSalary(CalculateSalary sl) {
		double grossSalary=sl.basic+sl.hra+sl.commision;
		return grossSalary; 
	}
	

	public static void main(String[] args) {
		CalculateSalary s=new CalculateSalary(80000.001,2000.02,1000.005);
		double salary=s.CalculateGrossSalary(s);
		System.out.println("Gross salary :"+salary);
		 

	}

}
