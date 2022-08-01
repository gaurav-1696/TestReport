package com.basic;

import java.util.Scanner;

public class Switchdemo6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("1.Reactangle \n 2.Circle \n 3.Triangle");
	System.out.println("enter the number");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("enter the length");
		int b=sc.nextInt();
		System.out.println("enter the breadth");
		int c=sc.nextInt();
		System.out.println("area of rectangle = "+(b*c));
		break;
	case 2:
		System.out.println("enter the radius");
		int r=sc.nextInt();
		double PI=3.14;
		double area=PI*r*r;
		System.out.println("area of the circle = "+area);
		break;
	case 3:
		System.out.println("enter the base");
		int d=sc.nextInt();
		System.out.println("enter the height");
		int e=sc.nextInt();
		double tri=0.5*d*e;
		System.out.println("area of triangle = "+tri);
		break;
		default:
			System.out.println("invalid choice");
		
	}
	sc.close();
}
}
