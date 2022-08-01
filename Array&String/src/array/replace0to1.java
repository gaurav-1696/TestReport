package array;

import java.util.Scanner;

public class replace0to1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=6;
	
	int a[]=new int[size];
	System.out.println("enter"+size+" elements");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("output");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==0)
		{
			a[i]=1;
		}
		System.out.println(a[i]+" ");
	}
	sc.close();
}
}
