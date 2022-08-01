package arrayHW;

import java.util.Arrays;

public class f2ndminvalue {
public static void main(String[] args) {
	int arr[]= {-20,0,-25,15,19,37,23};  
	int len=arr.length;
	for(int i=0;i<len;i++)
	{
		int flag=0;
		for(int j=i+1;j<len-1;j++)
		{
			if(arr[i]>arr[j+1])
			{
				int temp=arr[i];
				arr[i]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		if(flag==0)
		{
			break;
		}
	}
	
	System.out.println(Arrays.toString(arr));
	System.out.println("Second minimmum: "+arr[1]);
}
}
