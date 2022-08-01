package arrayHW;

import java.util.Arrays;

public class AppearEvenOdd {
public static void main(String[] args) {
	int arr[]= {3,2,1,4,6,5,7,10,9,8};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]%2==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	
	}
	System.out.println(Arrays.toString(arr));
}
}
