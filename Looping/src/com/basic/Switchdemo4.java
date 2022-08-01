package com.basic;

import java.util.Scanner;

public class Switchdemo4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the month ");
	int choice=sc.nextInt();
	 
	switch(choice)
	{
	case 1:
		System.out.println("January \n 30 days");
		
		break;
	case 2:
		System.out.println("February \n 28 days");
		break;
	case 3:
		System.out.println("March \n 31 days");
		break;
	case 4:
		System.out.println("April \n 30 days");
		break;
	case 5:
		System.out.println("May \n 31 days");
		break;
	case 6:
		System.out.println("June \n 30 days");
		break;
	case 7:
		System.out.println("July \n 31 days");
		break;
	case 8:
		System.out.println("August \n 31 days");
		break;
	case 9:
		System.out.println("September \n 30 days");
		break;
	case 10:
		System.out.println("October \n 31 days");
		break;
	case 11:
		System.out.println("November \n 30 days");
		break;
	case 12:
		System.out.println("December \n 31 days");
		break;
		default:
			System.out.println("Invalid");
	}
	sc.close();
}
}
