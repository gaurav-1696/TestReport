package arrayPractise;

import java.util.Arrays;

public class A5_ReverseArray {

	public static void main(String[] args) {
		int arr[]= {10,6,8,2,9,5,4,3,7,1};
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		
		System.out.println("Reverse array arr="+Arrays.toString(arr));		
	}

}
