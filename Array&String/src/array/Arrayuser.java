package array;

import java.util.Scanner;

public class Arrayuser {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=6;
	
	int a[]=new int[size];
	System.out.println("enter"+size+" elements");
	
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("element array are: ");
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]+" ");
	}
	sc.close();
}
}
