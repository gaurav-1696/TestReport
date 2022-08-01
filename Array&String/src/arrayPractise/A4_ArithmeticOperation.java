package arrayPractise;

import java.util.Scanner;

public class A4_ArithmeticOperation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();
		System.out.println("enter the array elements");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int positive =0,negative=0,odd=0,even=0,zero=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				positive++;
			}
			if(arr[i]<0)
			{
				negative++;
			}
			if(arr[i]%2!=0 && arr[i]>0)
			{
				odd++;
			}
			if(arr[i]%2==0 && arr[i]>0)
			{
				even++;
			}
			if(arr[i]==0) {
				zero++;
			}
		}
		System.out.println("number of positive numbers are: "+positive);
		System.out.println("number of negative numbers are: "+negative);
		System.out.println("number of odd numbers are: "+odd);
		System.out.println("number of even numbers are: "+even);
		System.out.println("number of 0's numbers are: "+zero);
		sc.close();
	}

}
