package practise;

import java.util.Arrays;
import java.util.Scanner;

public class Sawp_Array {
void swap(int arr[],int size)
{
	int b=size/2;
	for(int i=0;i<size/2;i++)
	{
		int temp=arr[i];
		arr[i]=arr[b];
		arr[b]=temp;
		b++;
		
	}
	System.out.println(Arrays.toString(arr));
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("enter the array element");
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	Sawp_Array s=new Sawp_Array();
	System.out.println("Swap array is:");
	s.swap(arr, size);
	sc.close();
}
}
