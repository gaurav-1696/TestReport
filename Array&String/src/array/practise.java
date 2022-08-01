package array;

import java.util.Scanner;

public class practise {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	System.out.println("enter the array size");
	int size=sc.nextInt();
	System.out.println("enter array element");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.print("even element sum from array is: ");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			sum=sum+a[i];
		}
		
	}
	System.out.println(sum);
	sc.close();
}
}
