package arraypractise2;

import java.util.Arrays;

public class DirectReverseArray {

	public static void main(String[] args) {
	System.out.println("1)");
		int arr[]= {3,90,45,29,37,78};
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("2)");
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
