package com.oops;

abstract class Vehicle{
	private String regnum;
	private String ownerName;
	private int parkingHours;
	
	 public Vehicle(String registrationNumber, String ownerName, int parkingDuration) {
	        this.regnum = regnum;
	        this.ownerName = ownerName;
	        this.parkingHours = parkingHours;
	    }
	 public String getregnum() {
	        return regnum;
	    }

	    public String getOwnerName() {
	        return ownerName;
	    }
	    

	    public int getParkingHours() {
	        return parkingHours;
	    }
	    
	    
	    public abstract double calculateParkingFee();

	    public abstract String getVehicleType();

	    public abstract void displayParkingDetails();
	}


