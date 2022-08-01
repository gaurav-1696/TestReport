
package arrayHW;

import java.util.Arrays;

public class reversearray2 {
	 public static void main(String[] args) {
			int arr[]= {1,2,3,4,5,6,7,8,9,10};
			int n=arr.length;
			   for(int i=0;i<n;i++)
			   {
				   if(arr[i]%2==0)
				   {
				   int temp=arr[i];
				   arr[i]=arr[n-i-1];
				   arr[n-i-1]=temp;
				   }
			   }
			  
			   System.out.println(Arrays.toString(arr));
}
}