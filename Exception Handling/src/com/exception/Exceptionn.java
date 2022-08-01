package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionn {
	/*
	 * static void add(int a, int b) { System.out.println("Addition is: " + (a +
	 * b)); }
	 */

	static void index(int arr[], int i) {
		System.out.println(arr[i]);
	}
	static void index(String s,int i)
	{
		System.out.println(s);
	}

	static void div(int a, int b) {
		System.out.println("Division in process");
		System.out.println("Division is: " + (a / b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 2, 3, 4, 5, 6 };
		String s="String";
		/*
		 * System.out.println("Enter 2 no"); int a = 0; int b = 0;
		 */
		try {
			/*
			 * a = sc.nextInt(); b = sc.nextInt(); div(a, b);
			 */
			index(arr, 3);
			// index(s,10);
			System.out.println(s.charAt(9));
		} catch (ArithmeticException | StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			e.getClass();
		}
		/*
		 * add(a, b); add(3, 4);
		 */

		System.out.println("Done with exception");
		sc.close();
	}
}
