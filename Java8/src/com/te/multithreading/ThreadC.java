package com.te.multithreading;

public class ThreadC implements Thread {
public static void main(String[] args) {
	Thread thread = new ThreadC();  
	thread.add(0, 100);

	System.out.println(thread);
	
	
}

@Override
public void add(int a, int b) {
	for (int i = a; i < b; i++) {
		System.out.println(i);
		
	}
}
}
