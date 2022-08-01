package com.exception;

import java.util.Scanner;

public class YoungerAgeEXceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		try
		{
			
		if(age<18)
		{
		throw new YoungerAgeEXception(" u are not for voting");
		}
		else
		{
		System.out.println("nodcd");
		}
		}
		catch(Exception e)
		
		{
			e.printStackTrace();
		}
		sc.close();
		}
	
}
