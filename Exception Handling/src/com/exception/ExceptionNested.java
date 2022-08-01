package com.exception;

import java.util.Scanner;

public class ExceptionNested {
	static void add(int a, int b) {
		System.out.println("Addition is: " + (a + b));
	}
	static void str(String s)
	{
		System.out.println(s.length());
	}

	static void index(int arr[], int i) {
		System.out.println(arr[i]);
	}

	static void div(int a, int b) {
		System.out.println("Division in process");
		System.out.println("Division is: " + (a / b));
	}
  static void arratElement(int arr[],int i)
  {
	  System.out.println("elements at the index is: "+arr[i]);
  }
  static void StringElement(String s,int i)
  {
	  System.out.println("character ar the index of a string is: ");
  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 2, 3, 4, 5, 6 };
		System.out.println("Enter 2 no");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try
		{
			try
			{
				try
				{
					arratElement(arr,7);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println(e);
				}
				StringElement("India",8);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			div(a,b);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		add(a,b);
		System.out.println("Done with this operation");
		sc.close();
	}
}
