package pattern;

import java.util.Scanner;

public class decrement {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int i,j,r;
	r=sc.nextInt();
	for(i=r-1;i>=0;i--)
	{
		for(j=0;j<=i;j++)
		{
			System.out.print("*" + " ");
		}
		System.out.println();
	}
}
}
