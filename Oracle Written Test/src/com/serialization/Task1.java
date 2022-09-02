package com.serialization;

public class Task1 extends Thread {
	public void run()
	{
		
		String[]a= {"abc","cde","xyz","lmn","pqr"};
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+a[i]);
		}
		
	}
	public static void main(String[] args) {

		Task1 t=new Task1();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
	
		
		t1.start();
		t2.start();

	}
}
