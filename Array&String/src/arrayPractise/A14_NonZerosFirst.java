package arrayPractise;

import java.util.Arrays;

public class A14_NonZerosFirst {

	public static void main(String[] args) {
	
     int arr[]= {12,0,7,0,8,0,3};
     for(int i=0;i<arr.length;i++)
     {
    	 for(int j=i+1;j<arr.length;j++)
    	 {
    		 if(arr[i]>arr[j])
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
