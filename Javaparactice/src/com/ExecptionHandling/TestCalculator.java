package com.ExecptionHandling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            double firstNumber = sc.nextDouble();

            System.out.print("Enter operator: ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double secondNumber = sc.nextDouble();

            Calculator c = new Calculator(firstNumber, operator, secondNumber);

            c.calculate();

        } catch (InputMismatchException e) {

            System.out.println("Invalid numeric input.");
        }

        sc.close();
    }
}