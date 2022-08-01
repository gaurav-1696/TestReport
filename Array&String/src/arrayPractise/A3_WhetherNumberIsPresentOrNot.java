package arrayPractise;

import java.util.Scanner;

public class A3_WhetherNumberIsPresentOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		System.out.println("enter the array elements");
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
					
		}
		System.out.println("enter the number to check");
		int number=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(number==arr[i])
			{
				
				System.out.println("given number is present in a given array");
				
			}
			else
			{
				System.out.println("Given number is not present in a array");
			}
		
		sc.close();
	}
	}
}
