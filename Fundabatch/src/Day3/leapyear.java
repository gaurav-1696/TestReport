package Day3;

import java.util.Scanner;

public class leapyear {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the year");
	int yr=sc.nextInt();

	if (yr%4==0) 
	{
		System.out.println("leap year");
	}
	else
	{
		System.out.println("Not a leap year");
		
	}
}
}
