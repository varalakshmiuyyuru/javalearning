package com.oops;

class Car extends Vehicle{
	private static final double RATE_PER_HOUR = 50;
	

    public Car(String registrationNumber, String ownerName, int parkingDuration) {
        super(registrationNumber, ownerName, parkingDuration);
    }

    @Override
    public double calculateParkingFee() {
        return getParkingHours() * RATE_PER_HOUR;
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }

    @Override
    public void displayParkingDetails() {
        System.out.println("Vehicle Type       : " + getVehicleType());
        System.out.println("Registration Number: " + getregnum());
        System.out.println("Owner Name         : " + getOwnerName());
        System.out.println("Parking Duration   : " + getParkingHours() + " hours");
        System.out.println("Parking Fee        : Rs." + calculateParkingFee());
    }
}

