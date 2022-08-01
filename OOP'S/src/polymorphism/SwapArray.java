package polymorphism;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {
	
	void swap(int a[],int size)
	{
		int a1=size/2;
		 for(int i=0;i<size/2;i++)
		  {
			  int temp=a[i];
			  a[i]=a[a1];
			  a[a1]=temp;
			  a1++;
		  }
		 System.out.println(Arrays.toString(a));
	}
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the array size");
	   int size=sc.nextInt();
	int a[]= new int[size];
	System.out.println("array"+size+" element:");
	  for(int i=0;i<size;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  SwapArray c= new SwapArray();
	  System.out.println("Swap array: ");
	 c.swap(a, size);
	  sc.close();
}
}
