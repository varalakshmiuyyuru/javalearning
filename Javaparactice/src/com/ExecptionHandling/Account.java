package com.ExecptionHandling;


public class Account {

    static double balance;

    Account(double balance) {
        Account.balance = balance;
    }

    public static void withdraw(double amount) throws CustomExceptionDemo {

        if (amount > balance) {
            throw new CustomExceptionDemo("Insufficient funds");
        }

        balance = balance - amount;

        System.out.println(amount + " Amount withdrawn successfully");
        System.out.println("Remaining balance: " + balance);
    }

    public static void main(String[] args) {

        Account a = new Account(10000);

        try {
            a.withdraw(11000);
        }
        catch (CustomExceptionDemo e) {
            System.out.println("Exception occurred");
            System.out.println(e.getMessage());
        }
    }
}