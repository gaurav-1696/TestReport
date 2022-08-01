package arrayPractise;

import java.util.Scanner;

public class ArrayEvenNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	System.out.println("enter the array element");
	int a[]=new int[size];
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("even number from a given array");
	int sum=0;
	for(int i=0;i<size;i++)
	{   
		
		if(a[i]%2==0)
		{
			sum+=a[i];
			//System.out.print(a[i]+" ");
		}
	}
	System.out.println(sum);
	sc.close();
}
}
