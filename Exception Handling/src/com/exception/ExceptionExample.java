package com.exception;

import java.util.Scanner;

public class ExceptionExample {
   static void add(int a,int b)
   {
	   System.out.println("Addition is: "+(a+b));
   }
   static void divide(int a,int b)
   {
	   System.out.println("Division in process");
	   System.out.println("Division is: "+(a/b));
   }
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	add(a,b);
	try
	{
		divide(a,b);
	}
	catch(ArithmeticException e )
	{
		//System.out.println(e);
		e.printStackTrace();
	}
	sc.close();
}
}
