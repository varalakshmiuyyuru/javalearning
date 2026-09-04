package com.dateandtime.methods;

public class CallCompeny {
public static void main(String[] args) {
   Compeny compeny=new Compeny(100,"Codegnan",200,"Hyd",1000000.2963);

   int compenyId=compeny.getCompenyId();
  
   String compenyName=compeny.getCompenyName();
   int empCount=compeny.getEmployeeCount();
   String compenyLocation=compeny.getCompenyLocation();
   double compenyTurnover=compeny.getCompenyTurnover();
   System.out.println("Compeny id : "+compenyId);
   System.out.println("Compeny name : "+compenyName);
   System.out.println("Employee count : "+empCount);
   System.out.println("Compeny Location"+compenyLocation);
   System.out.println("Compeny Turnover : "+compenyTurnover);

	}

}
