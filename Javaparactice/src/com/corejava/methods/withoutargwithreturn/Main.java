package com.corejava.methods.withoutargwithreturn;

public class Main {

	// method which returns a Student object
	public Company getCompany() {
		Company companyRef = new Company(100, "Codegnan", 200, "Hyderabad", 23450.37);
		return companyRef;
	}

	// A method returning a String array
	public String[] getEmployeeList() {
		// String[] empList = new empList[3];
		String[] empList = { "Suman", "Kumar", "Lakshmi" };
		return empList;
	}

	public Company[] getCompaniesList() {

		Company[] companyArray = {

				new Company(100, "Codegnan", 200, "Hyderabad", 23450.37),
				new Company(101, "Accenture", 20000, "Hyderabad", 2233450.37),
				new Company(102, "Facebook", 30000, "Hyderabad", 1233450.37),
				new Company(102, "Paypal", 40000, "Bangalore", 1233450.37)

		};

		return companyArray;
	}

	public static void main(String[] args) {

		/*
		 * Company company = new Company(100,"Codegnan",200,"Hyderabad",23450.37);
		 * System.out.println(company.getCompanyId());
		 * 
		 * int companyId= company.getCompanyId(); System.out.println("Company ID: "+
		 * companyId);
		 * 
		 * 
		 * String companyName = company.getCompanyName(); int empCount=
		 * company.getEmployeeCount(); String companyLocation =
		 * company.getCompanyLocation(); double companyTurnover =
		 * company.getCompanyTurnover();
		 * 
		 * 
		 * System.out.println(companyName); System.out.println(empCount);
		 * System.out.println(companyLocation); System.out.println(companyTurnover);
		 */

		Main m = new Main();

		Company objRef = m.getCompany();

		System.out.println(objRef.getCompanyId());
		System.out.println(objRef.getCompanyName());
		System.out.println(objRef.getEmployeeCount());
		System.out.println(objRef.getCompanyLocation());
		System.out.println(objRef.getCompanyTurnover());

	}

}
