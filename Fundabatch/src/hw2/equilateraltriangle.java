package hw2;

import java.util.Scanner;

public class equilateraltriangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of sides");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a==b && b==c)
	{
		System.out.println("Given triangle is an equilaternal");
	}
	else
	{
		System.out.println("Given triangle is not an Equilateral");
	}
}
}
