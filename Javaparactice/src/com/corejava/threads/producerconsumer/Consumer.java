package com.corejava.threads.producerconsumer;

public class Consumer extends Thread{
	private MessageBox messageBox;
	public Consumer(MessageBox messageBox) {
		this.messageBox=messageBox;
		
	}
	public void run() {
		try {
			messageBox.consume();
			messageBox.consume();
			messageBox.consume();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
