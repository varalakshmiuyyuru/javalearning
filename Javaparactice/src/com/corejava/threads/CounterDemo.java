package com.corejava.threads;

public class CounterDemo {
public static void main(String[]arge) throws InterruptedException {
	Counter c=new Counter();
	//Thread1
	Thread t1=new Thread(new Runnable() {
		
		@Override
		public void run() {
		for (int i=0;i<10000;i++) {
		c.increment();
		}
		}
	});
	//Thread2
	
   Thread t2=new Thread(new Runnable() {
		
		@Override
		public void run() {
		for (int i=0;i<10000;i++) {
		c.increment();
		}
		}
	});
   t1.start();
   t2.start();
   
   t1.join();
   t2.join();
   System.out.println("Final count : "+c.getCount());
   
}
}
