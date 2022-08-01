package com.exceptionpp;

public class JavaExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//code that may raise exception
			int d=100/0;
			System.out.println(d);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			//System.out.println(e);
		}
		//rest of the code
		int a=10,b=20;
		int c=a+b;
		System.out.println("Addition="+c);
	}

}
