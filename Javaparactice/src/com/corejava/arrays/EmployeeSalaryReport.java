package com.corejava.arrays;
public class EmployeeSalaryReport {

    public static void main(String[] args) {

    	
        // 2D Array
        // Rows    -> Employees
        // Columns -> Quarterly Salaries (Q1, Q2, Q3, Q4)

        int[][] salary = {
                {50000, 52000, 51000, 53000}, // Employee 1
                {45000, 47000, 48000, 49000}, // Employee 2
                {60000, 61000, 62000, 63000}, // Employee 3
                {55000, 54000, 56000, 57000}, // Employee 4
                {48000, 49000, 50000, 51000}  // Employee 5
        };

        // Variable to store the highest annual salary
        int highestAnnualSalary = 0;

        // Variable to store the employee number having highest annual salary
        int highestEmployee = 0;

        // Variable to store the total of all quarterly salaries
        int grandTotal = 0;

        // Variable to store the highest quarterly salary
        int highestQuarterSalary = salary[0][0];

        System.out.println("----------- Employee Salary Report -----------");

        // Outer loop traverses each employee (row)
        for (int i = 0; i < salary.length; i++) {

            // Variable to calculate annual salary of current employee
            int annualSalary = 0;

            System.out.print("Employee " + (i + 1) + " Salaries : ");

            // Inner loop traverses each quarter (column)
            for (int j = 0; j < salary[i].length; j++) {

                // Display quarterly salary
                System.out.print(salary[i][j] + " ");

                // Add quarterly salary to annual salary
                annualSalary += salary[i][j];

                // Add to grand total
                grandTotal += salary[i][j];

                // Find highest salary paid in any quarter
                if (salary[i][j] > highestQuarterSalary) {
                    highestQuarterSalary = salary[i][j];
                }
            }

            // Display annual salary of current employee
            System.out.println("\nAnnual Salary = " + annualSalary);

            // Check if current employee has highest annual salary
            if (annualSalary > highestAnnualSalary) {
                highestAnnualSalary = annualSalary;
                highestEmployee = i + 1;
            }

            System.out.println();
        }

        // Total number of salary entries
        int totalEntries = salary.length * salary[0].length;

        // Calculate average quarterly salary
        double averageSalary = (double) grandTotal / totalEntries;

        // Display final results
        System.out.println("----------------------------------------------");
        System.out.println("Employee with Highest Annual Salary : Employee " + highestEmployee);
        System.out.println("Highest Annual Salary : " + highestAnnualSalary);

        System.out.println("Highest Quarterly Salary : " + highestQuarterSalary);

        System.out.println("Overall Average Quarterly Salary : " + averageSalary);
    }
}