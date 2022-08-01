package com.basic;

import java.util.Scanner;

public class Switchdemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		switch (n % 2)

		{
		case 0:
			System.out.println("given number is even");
			break;
		default:
			System.out.println("given number is odd");
		}
		sc.close();
	}
}
