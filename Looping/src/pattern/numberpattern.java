package pattern;

import java.util.Scanner;

public class numberpattern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the row number");
	int r=sc.nextInt();
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=i;j++)
		{
		 System.out.print(i+" ");	
		}
		System.out.println();
	}
	sc.close();
}
}
