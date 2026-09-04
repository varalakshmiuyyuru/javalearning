package com.ExecptionHandling;

import java.util.Scanner;

public class TestNumberConverter {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String number = sc.next();

        NumberConverter n = new NumberConverter(number);

        n.convertAndFindSquare();

        sc.close();
    }

}
