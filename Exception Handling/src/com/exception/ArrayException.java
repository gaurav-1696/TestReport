package com.exception;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayException {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the index");
	int v=sc.nextInt();
	int arrr[]= {1,2,4,5,8};
	
	try
	{
		System.out.println(v);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		e.getClass();
		e.printStackTrace();
	}
	System.out.println(Arrays.toString(arrr));
	
	sc.close();
}
}
