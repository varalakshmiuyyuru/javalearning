package com.oops;
import java.util.Scanner;

public class SmartParkingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("       SMART PARKING SYSTEM");
        System.out.println("=================================");

        System.out.print("Enter Registration Number: ");
        String regnum = sc.nextLine();

        System.out.print("Enter Owner Name: ");
        String ownerName = sc.nextLine();

        System.out.println("\nSelect Vehicle Type:");
        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Electric Car");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Parking Duration (hours): ");
        int parkingHours = sc.nextInt();

        Vehicle vehicle;

        // Polymorphism
        switch (choice) {

            case 1:
                vehicle = new Bike(
                        regnum,
                        ownerName,
                        parkingHours
                );
                break;

            case 2:
                vehicle = new Car(
                        regnum,
                        ownerName,
                        parkingHours
                );
                break;

            case 3:
                vehicle = new ElectricCar(
                        regnum,
                        ownerName,
                        parkingHours
                );
                break;

            default:
                System.out.println("Invalid vehicle type!");
                sc.close();
                return;
        }

        System.out.println("\n=================================");
        System.out.println("       PARKING DETAILS");
        System.out.println("=================================");

        vehicle.displayParkingDetails();

        System.out.println("=================================");

        sc.close();
    }
}