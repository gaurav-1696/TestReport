package Day2;

import java.util.Scanner;

public class Divisibleby7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	if(a%7==0)
	{
		System.out.println("divisble");
	}
	else
		System.out.println("not divisible");
	sc.close();
}
}
