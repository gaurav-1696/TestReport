package array;

import java.util.Arrays;
public class reversearray {
	 public static void main(String[] args) {
	int arr[]= {10,20,30,40,50,60};
	
	   for(int i=0;i<arr.length/2;i++)   //Quick sort
	   {
		   int temp=arr[i];
		   arr[i]=arr[arr.length-i-1];
		   arr[arr.length-i-1]=temp;
	   }
	   System.out.println("reverse of array is : ");
	   System.out.println(Arrays.toString(arr));		
	}
	 
}
