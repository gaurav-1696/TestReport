 package array;

import java.util.Arrays;

public class Quicksorting {
	public static void main(String[] args) {
		int arr[]= {50,10,80,30,90,20,60,70};  //Quick sort
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len-1;j++)
			{
				if(arr[i]<arr[j+1])
				{
					int temp=arr[i];
					arr[i]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
}
}
