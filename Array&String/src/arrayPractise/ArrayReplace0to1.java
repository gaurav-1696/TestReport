package arrayPractise;

import java.util.Scanner;

public class ArrayReplace0to1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	System.out.println("enter the array element");
	int a[]=new int [size];
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("replaced array :");
	int i=0;
while(i<size)
{
	if(a[i]==0)
	{
		a[i]=1;
	}
	System.out.println(a[i]+" ");
	i++;
}
sc.close();
}
}