package com.corejava.threads;

public class Counter {
int count=0;
//synchronized is used to lock one thread release only when that work is done
public synchronized void increment() {
	count++;
}
public int getCount() {
	return count;
}
}
