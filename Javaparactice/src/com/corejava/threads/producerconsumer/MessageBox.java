package com.corejava.threads.producerconsumer;



public class MessageBox {

	private String message;
	private boolean messageAvailable = false;
	
	
	//wait() is there in the method so it must be synchronized
	public synchronized void produce(String message) throws InterruptedException
	{
		//if a msg is already available producer must wait untile the consumer consumes it
		
		while(messageAvailable)
		{
			System.out.println("MessageBox is full, Producer is waiting");
			wait();
		}
		
		this.message = message ; //if msgbox is empty
		
		messageAvailable = true;
		
		System.out.println("Message Procuded : "+message);
		
		//notify the waiting thread - Consumer , so that consumer can consume the message.
		
		notifyAll(); //when multiple threads are waiting notifyAll() can be called 
		//when single thread is there notify() is called.
		
		
	}
	
	public synchronized String consume() throws InterruptedException
	{
		//if there is no message , consumer will not do anything, it keeps waiting
		
		while(!messageAvailable)
		{
			System.out.println("MessageBox is Empty, Consumer is waiting");
			wait();
		}
		
		
		//take/consume the message
		String receivedMessage = message;
		 
		System.out.println("Consumed: "+receivedMessage);
		
		//after consuming the message,
		messageAvailable = false;
		
		//notify waiting thread  - ProducerThread
		notifyAll();
		
		return receivedMessage;
		
	}
	
	
	
	
}
