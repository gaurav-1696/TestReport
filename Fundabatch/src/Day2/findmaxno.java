package Day2;

import java.util.Scanner;

public class findmaxno {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two number");
	System.out.println("enter the first number: ");
	int a=sc.nextInt();
	System.out.println("enter the second number: ");
	int b=sc.nextInt();
	if(a>b)
	{
		System.out.println("max="+a);
	}
	else {
		System.out.println("max="+b);
	}
	sc.close();
}
}
