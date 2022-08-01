package nestedForLoop;

import java.util.Scanner;

public class pattern10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no.");
	int a=sc.nextInt();
	int i,j;
	
	for(i=a;i>=1;i--)
	{
		char ch='A';
		for(j=i;j>=1;j--)
		{
			System.out.print(ch);
			ch++;
		}
		System.out.println();
		
	}
	for(i=1;i<=a;i++)
	{
		char b='A';
		for(j=1;j<=i;j++)
		{
			System.out.print(b);
			b++;
		}
		System.out.println();
	}
	sc.close();
}
}
