package arrayHW;

import java.util.Scanner;

public class ex2 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		int size=10;
		
		int a[]=new int[size];
		System.out.println("enter"+size+" elements");
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("element array are: ");
		for(int i=0;i<size;i++)
		{
			if(a[i]>=0)
			{
				System.out.println("positive number "+a[i]);
				
			}
			if(a[i]<0)
			{
				System.out.println("negative number "+a[i]);
				
			}
			if(a[i]%2==0)
			{
				System.out.println("even number "+a[i]);
				
			}
			if(a[i]%2!=0)
			{
				System.out.println("odd number "+a[i]);
			}
			//System.out.print(a[i]+" ");
		}
	sc.close();	
}
}
