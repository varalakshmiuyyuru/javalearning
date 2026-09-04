package com.dateandtime.methods;

public class FactorialRcursive {
	public static int factorial(int n) {
		//base condition                                        //fact(1)  here base condition is reached
		                                                        //result is 1*1=1
		if(n==0 || n==1) {                                      //fact(2) check the condition
			return 1;                                           //result is 1*2=2
			                                                    //fact(3) check the  condition 
			                                                    //result is 1*2*3=6
		}                                                        //fact(4) check the condition
		                                                         //result is 1*2*3*4=24
		int result=n*factorial(n-1);                              //fact(4) check the condition
                                                                  //result is 1*2*3*4*5=120
		return result;                                            // main() method
	}

	public static void main(String[] args) {
		int num=0;
		int result=factorial(num);
		System.out.println(result);
	
	}

}
