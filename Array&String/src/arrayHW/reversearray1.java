package arrayHW;

import java.util.Arrays;

public class reversearray1 {
	 public static void main(String[] args) {
			int arr[]= {3,90,45,29,37,78};
			int n=arr.length;
			   for(int i=0;i<n/2;i++)
			   {
				   int temp=arr[i];
				   arr[i]=arr[n-i-1];
				   arr[n-i-1]=temp;
			   }
			   System.out.println("reverse of array is : ");
			   System.out.println(Arrays.toString(arr));
}
}
