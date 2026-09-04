package com.inheritance;

public class TestAutoMobile {

	public static void main(String[] args) {
		AutoMobileFeature amf=new AutoMobileFeature();
		System.out.println(" ");
		amf.start();//overridden called
		amf.breaking();//parent method calling
		amf.sesting();//parent method calling
		AutoMobileBehavior amb=new AutoMobileBehavior();
		System.out.println(" ");
		amb.breaking();//overridden called
		amb.opensunroof();//child method calling
		AutoMobileSeating ams=new AutoMobileSeating();
		System.out.println(" ");
		ams.seating();//overridden called
		ams.colour();//child method calling
		ams.breaking();//parent method calling
	}

}
