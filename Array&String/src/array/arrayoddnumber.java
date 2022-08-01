package array;

import java.util.Scanner;

public class arrayoddnumber {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		int size=6;
		
		int a[]=new int[size];
		System.out.println("enter"+size+" elements");
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		System.out.println("element array are: ");
		for(int i=0;i<size;i++)
		{
			if(a[i]%2!=0)
			{
			sum=sum+a[i];
			}
			//System.out.println(a[i]+" ");
		}
		System.out.println("Addition: "+sum);
		sc.close();
}
}
