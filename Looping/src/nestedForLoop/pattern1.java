package nestedForLoop;

import java.util.Scanner;

public class pattern1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int i,j,r;
	r=sc.nextInt();
	for(i=r;i>=1;i--)
	{
		for(j=r-1;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
