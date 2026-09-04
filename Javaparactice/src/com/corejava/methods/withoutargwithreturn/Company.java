package com.corejava.methods.withoutargwithreturn;

public class Company {
	
	int companyId;
	String companyName; 
	int empCount; 
	String companyLocation; 
	double companyTurnover; 
	
	
	public Company(int companyId, String companyName, int empCount, 
			String companyLocation, double companyTurnover) {
		//super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.empCount = empCount;
		this.companyLocation = companyLocation;
		this.companyTurnover= companyTurnover; 
	}
	
	
	public int getCompanyId() {
		return companyId;		
	}
	
	public String getCompanyName() {
		
		return companyName;
	}
	
	public int getEmployeeCount() {
		return empCount; 
	}
	
	public String getCompanyLocation() {
		return companyLocation; 
	}
	
	public double getCompanyTurnover() {
		return companyTurnover;
	}
	
	

}
