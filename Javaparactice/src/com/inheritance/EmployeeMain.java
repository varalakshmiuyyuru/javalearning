package com.inheritance;

public class EmployeeMain {

	public static void main(String[] args) {
//		Employee emp=new Employee(111,"kalpana","codegnan",1000000.00);
//		emp.getEmployeeDetails();
//		System.out.println(emp.id);
//		System.out.println(emp.name);
//		System.out.println(emp.compenyName);
//		
//		emp.calculateSalary();
//		System.out.println(emp.salary);
		//EmployeeInheritance ei=new EmployeeInheritance(111,"kalpana","codegnan",1000000.00)
		EmpolyeeInherit ei=new EmpolyeeInherit(111,"kalpana","codegnan",100000.00);
		
		ei.location="hydrabad";
		ei.getDetails();
		ei.branchId=5;
		ei.branch="java full stack";
		ei.getmore();
//		System.out.println( );
//		System.out.println(ei.id);
//		System.out.println(ei.name);
//		System.out.println(ei.compenyName);
//		System.out.println(ei.salary);
//		System.out.println(ei.location);

		
		
        
	}
	

}


