package com.corejava.threads.producerconsumer;

public class InterThreadDemo {
	//shared variable
    public static volatile boolean running=true;
	public static void main(String[] args) throws InterruptedException {
		//Runnable thread
		Thread worker=new Thread(new Runnable(){
			
			public void run() {
				System.out.println("worker therad started");
			while(running) {
				//	
				//System.out.println(" in while loop");
				}	
				System.out.println("Worker thread stoped");
		}//run() closing
			
		}//runnable closing
		);//Thread constructor closing
		
		worker.start();
		
	    Thread.sleep(200);
	    System.out.println("Main thread changing running variable");
	    //main thread changing the value of running variable to false
		running=false;
	}

}

