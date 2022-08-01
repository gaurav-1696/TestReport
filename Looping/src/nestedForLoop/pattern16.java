package nestedForLoop;

import java.util.Scanner;

public class pattern16 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,j;
	int r=sc.nextInt();
	for(i=0;i<r;i++)
	{
		for(j=4;j>=i;j--)
		{
			System.out.println(" ");
		}
		for(int k=0;j<=i;k++)
		{
		  System.out.println();	
		}
	}
	sc.close();
}
}
