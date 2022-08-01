package com.basic;

import java.util.Scanner;

public class Switchdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");
		String input = sc.next();
		switch (input) {
		case "happy":
			System.out.println("Happy");
			break;
		case "new":
			System.out.println("New");
			break;
		case "year":
			System.out.println("Year");
			break;
		default:
			System.out.println("welcome");
		}
		sc.close();
	}

}
