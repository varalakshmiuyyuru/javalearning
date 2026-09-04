package com.wraperclasses;

public class IntegerPrinterMain {

	public static void main(String[] args) {
//		IntegerPrinter ip=new IntegerPrinter(20);
//		ip.printer();
		
		GenaricPrinter<Integer> gpi=new GenaricPrinter<>(200);
		gpi.printer();
		
		
//		StringPrinter sp=new StringPrinter("java");
//		sp.printer();
		
		GenaricPrinter<String> gps=new GenaricPrinter<>("varalakshmi");
		gps.printer();
		
//		DoublePrinter dp=new DoublePrinter(20);
//		dp.printer();
		
		GenaricPrinter<Double> gpd=new GenaricPrinter<>(20.0);
		gpd.printer();
	
		
		
		

	}

}
