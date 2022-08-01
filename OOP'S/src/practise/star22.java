package practise;

import java.util.Scanner;

public class star22 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the the number");
	int n=sc.nextInt();
	
//	  int i=1;
//	  while(i<=n) {
//		  for(int j=1;j<=i;j++) 
//		  { System.out.print("*"); 
//		  } i++;
//	  System.out.println(); }
	 
	for(int i=1;i<=n;i++)
	{
		int j=1;
		while(j<=i)
		{
			System.out.print("*");
			j++;
		}
		System.out.println();
	}
	sc.close();
}
}
