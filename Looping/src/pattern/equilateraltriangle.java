package pattern;

import java.util.Scanner;

public class equilateraltriangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int i,j,r;
	r=sc.nextInt();
	for(i=0;i<r;i++)
	{
		for(j=r-i;j>1;j--)
		{
			System.out.print(" ");
		}
		for(j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}