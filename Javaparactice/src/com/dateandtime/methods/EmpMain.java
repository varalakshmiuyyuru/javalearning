package com.dateandtime.methods;

import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Employee ID: ");
	        int empId = sc.nextInt();
	        sc.nextLine(); // Consume the leftover newline

	        System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter age: ");
	        int age = sc.nextInt();

	        System.out.print("Enter Salary: ");
	        double salary = sc.nextDouble();

	        Employee emp = new Employee(empId, name, age, salary);

	        System.out.println("\nEmployee Details");
	        System.out.println("-------------------------");
	        System.out.println("Employee ID   : " + emp.empId);
	        System.out.println("Employee Name : " + emp.name);
	        System.out.println("Designation   : " + emp.age);
	        System.out.println("Salary        : " + emp.salary);


	}

}
