package com.ExecptionHandling;
import java.util.InputMismatchException;


public class Calculator {
	double firstNumber;
	char operator;
    double secondNumber;
    
    Calculator(double firstNumber,char operator,double secondNumber){
    	this.firstNumber=firstNumber;
    	this.operator=operator;
    	this.secondNumber=secondNumber;
    }
    
    void calculate() {
    try {
    	switch(operator) {
    	case '+':
    	System.out.println("Result : "+ (firstNumber+secondNumber));
    	break;
    	case '-':
        	System.out.println("Result : " +(firstNumber-secondNumber));
        	break;
    	case '*':
        	System.out.println("Result : " +firstNumber*secondNumber);
        	break;
    	case '/':
    		 if (secondNumber == 0) {
                 throw new ArithmeticException("Cannot divide by zero.");
             }
        	System.out.println("Result : "+firstNumber/secondNumber);
        	break;
    	case '%':
    		 if (secondNumber == 0) {
                 throw new ArithmeticException("Cannot divide by zero.");
             }
        	System.out.println("Result : "+firstNumber%secondNumber);
        	break;
    	default:
            System.out.println("Invalid operator.");
        }

    } catch (ArithmeticException e) {

        System.out.println(e.getMessage());

    } catch (InputMismatchException e) {

        System.out.println("Invalid numeric input.");
    }
}
}

    	
    

 

