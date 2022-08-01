package com.While;

import java.util.Scanner;

public class Whiledemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	System.out.println("greatest number is: ");
	if(a>b && a>c )
	{
		System.out.println(a);
	}
	else if(b>a && b>c)
	{
		System.out.println(b);
		
	}
	else
		System.out.println(c);
	sc.close();
}
}
