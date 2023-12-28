package com.assignments;

class Newthread implements Runnable {
	
	Thread t;
	String tname;
	public Newthread(String tname) {
		t=new Thread("My Thread");
		t.start();
	}
	public void run() {	
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
				Thread.sleep(3500);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("My Thread Exiting");
	}
}

public class ThreadByExtending{
	private static char[] t;

	public static void main(String[] args) {
		System.out.println(t);
	}
}
