package com.ExecptionHandling;

public class NumberConverter {
	String number;

    NumberConverter(String number) {
        this.number = number;
    }

    void convertAndFindSquare() {

        try {

            int num = Integer.parseInt(number);

            int square = num * num;

            System.out.println("Number : " + num);
            System.out.println("Square : " + square);

        } catch (NumberFormatException e) {

            System.out.println("Invalid number format.");
        }
   
    }
}
