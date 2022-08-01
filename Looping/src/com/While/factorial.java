package com.While;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int i = 1;
		int facto = 1;
		
		  while (i <= n) 

		  { 
		  facto = facto * i; 
		  i++; 
		  }
		  System.out.println("factorial of given number is " + facto); 
		  sc.close();
		  int j;
		  
		for( j=1;j<n;j++)
		{
			if(n%j==0)
			{
				System.out.println(j+" ");
			}
		}
		System.out.println(j);
	}
}
