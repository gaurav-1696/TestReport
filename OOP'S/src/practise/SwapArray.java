package practise;

import java.util.Arrays;

public class SwapArray {
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,8,9};
		int size=arr.length/2;
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[size];
			arr[size]=temp;
			size++;
		}
		System.out.println(Arrays.toString(arr));
	}
}