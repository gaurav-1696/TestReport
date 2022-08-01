package arrayPractise;

import java.util.Arrays;

public class A13_StringReverseOnlyWords {

	public static void main(String[] args) {	
		String arr[]= {"hi","how","are","you","doing"};
		for(int i=0;i<arr.length/2;i++)
		{
			String temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
