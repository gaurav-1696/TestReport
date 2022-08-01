package arrayHW;

import java.util.Arrays;

public class f2ndmaxvalue {

	public static void main(String[] args) {
		int arr[]= {20,0,31,45,100,1,105,90};  
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len-1;j++)
			{
				if(arr[i]>arr[j+1])
				{
					int temp=arr[i];
					arr[i]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("second highest value: "+arr[2]);
	}

}
