package arraypractise2;

import java.util.Scanner;

public class OddElementAvg {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter the array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				sum=sum+arr[i];
				count++;
			}
			
		}
		float average=sum/count;
		System.out.println("avegare="+average);
		sc.close();
		
	}

}
