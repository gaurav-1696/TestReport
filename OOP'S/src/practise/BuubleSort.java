package practise;

import java.util.Arrays;
import java.util.Scanner;

public class BuubleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		System.out.println("enter the array element");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		/*
		 * int max=Integer.MIN_VALUE; int min=Integer.MAX_VALUE; for(int
		 * i=0;i<arr.length;i++) { if(arr[i]<min) { min=arr[i]; } if(arr[i]>max) {
		 * max=arr[i]; }
		 * 
		 * } //System.out.println(Arrays.toString(arr)); System.out.println(min);
		 */
		/*for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}*/
		//}
		/*
		 * int arr2[]= {1,2,3,4,5,6}; for(int i=0;i<size;i++) { for(int
		 * j=0;j<arr2.length;j++) { if(arr[i]==arr2[j]) {
		 * System.out.println("both array are equal"); } else {
		 * System.out.println("not equals"); } } }
		 *//*
			 * int n=size/2; for(int i=0;i<size/2;i++) { int temp=arr[i];
			 * arr[i]=arr[size-i-1]; arr[size-i-1]=temp; }
			 * System.out.println(Arrays.toString(arr));
			 */
		/*
		 * for(int i=0;i<arr.length/2;i++) { int temp=arr[i]; arr[i]=arr[size/2];
		 * arr[size/2]=temp; size++; } System.out.println(Arrays.toString(arr));
		 */
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr[i]=1;
			}
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
	}


