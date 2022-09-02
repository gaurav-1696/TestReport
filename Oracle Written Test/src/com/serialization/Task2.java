package com.serialization;

public class Task2 implements Runnable {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	public static void main(String[] args) {
		
	Task2 ts=new Task2();
		
	Thread t1=new Thread(ts);
		Thread t2=new Thread(ts);
		

		t1.setName("AB");
		t2.setName("CD");
		t1.start();
		t2.start();
		t1.setName("XY");
		t2.setName("PQ");
	}
}
