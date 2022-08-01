package arrayPractise;

import java.util.Scanner;

public class IntegersInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		System.out.println("enter the array elements");
		int a[]=new int [size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]>0)
			{
				System.out.println("positive numbers are: "+a[i]+" ");
			}
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]<0)
			{
				System.out.println("Negative number are: "+a[i]+" ");
			}
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0 && a[i]>0)
			{
				System.out.println("even numbers are: "+a[i]+" ");
			}
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]%2!=0 && a[i]>0)
			{
				System.out.println("odd numbers are: "+a[i]+" ");
			}
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]==0)
			{
				System.out.println("0s number are: "+a[i]+" ");
			}
		}
		sc.close();
	}

}
