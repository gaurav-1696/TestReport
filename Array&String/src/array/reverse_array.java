package array;

import java.util.Arrays;

public class reverse_array {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,6,5,7,8,9};
	for(int i=arr.length-1;i>=0;i--)
	{
		
		System.out.print(arr[i]+" ");
	}
	System.out.println(Arrays.toString(arr));
}
}
