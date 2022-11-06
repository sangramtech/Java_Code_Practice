package com.src;

public class MyThread implements Runnable {
	
	public void run() {
		System.out.println("Thread Execution");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		Thread t1 = new Thread(thread);
		t1.start();
		System.out.println(t1.getPriority());
		System.out.println(t1.getName());
		
		
		
	}

}
