package com.abstraction;

public class EmployeeTest {

	public static void main(String[] args) {
		 FullTimeEmployee fe=new  FullTimeEmployee(101, "Kalpana", 1000000.00);
		 FullTimeEmployee fe1=new  FullTimeEmployee(103, "manga", 100000.00);
		 fe.displayDetails();
		 fe.calculateSalary();
		 System.out.println();
		 fe1.displayDetails();
		 fe1.calculateSalary();
		 System.out.println();    
		 Employee pe=new PartTimeEmployee(102, "varalakshmi",10 , 5000.00);
		 Employee pe1=new PartTimeEmployee(104, "siva kumari",10 , 5000.00 );
		 pe.displayDetails();
		 pe1.calculateSalary();
		 System.out.println();
		 pe1.displayDetails();
		 pe1.calculateSalary();
	}
}
