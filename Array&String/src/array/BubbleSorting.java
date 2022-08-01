package array;

import java.util.Arrays;

public class BubbleSorting {
  public static void main(String[] args) {
	int arr[]= {50,10,80,30,90,20,60,70};  // bubble sort
	int len=arr.length;
	for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<len;j++)
		{
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr) );
	System.out.println(arr[1]);
}
  }