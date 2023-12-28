package com.assignments;

public class MyRunnable implements Runnable {
	
	public void run() {
        System.out.println("This is a thread created by implementing the Runnable interface.");
    }
   public static void main(String[] args) {
    MyRunnable myRunnable = new MyRunnable();
    Thread myThread = new Thread(myRunnable);
    myThread.start();
}
}

