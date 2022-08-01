package forLoop;

import java.util.Scanner;

public class Factor {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	System.out.println("Factor of "+num+" number is:");
//	int i=1;
//while( i<=num)
//	{
//		if(num%i==0)
//		{
//			System.out.print(i+" ");
//		}
//		i++;
//	}
	  for(int j=1;j<=num;j++)
	   { 
	       
	        
	        if(num%j==0) 
	  { 
	  System.out.print(j+" "); } 
	  }
	 
	sc.close();
}
}
