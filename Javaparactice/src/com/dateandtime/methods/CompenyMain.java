package com.dateandtime.methods;

public class CompenyMain {

	public static void main(String[] args) {
		 CompenyArray ca=new  CompenyArray(0," ",0,"",0);
		 CompenyArray company = ca.getCompeny();

		    System.out.println("Compeny id : "+company.compenyId);
		    System.out.println("Compeny name: "+company.compenyName);
		    System.out.println("employee count :"+company.empCount);
		    System.out.println("Compeny Location : "+company.compenyLocation);
		    System.out.println("Compeny income : "+company.income);
		    
		    System.out.println("------------------");
	 String[] employees = ca.getEmployeeList();
	 for (int i = 0; i < employees.length; i++) {
	        System.out.println("Employee :"+employees[i]);
	    }
	 System.out.println("------------------");
	 CompenyArray[] companies = ca.getCompenyList();

	    for (int i = 0; i < companies.length; i++) {

	        System.out.println("Compeny id : "+companies[i].compenyId);
	        System.out.println("compeny Name : "+companies[i].compenyName);
	        System.out.println("Employee count : "+companies[i].empCount);
	        System.out.println("comeny Location"+companies[i].compenyLocation);
	        System.out.println("Amount : "+companies[i].income);

	        System.out.println("------------------");
	    }
	}
	

}
