package arraypractise2;

import java.util.Arrays;

public class Find2ndMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)
		System.out.println("1)");
int arr[]= {1,2,3,4,5,6,7,8,9,10};
for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]<arr[j])
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	
}
System.out.println(Arrays.toString(arr));
System.out.println("Second  max value="+arr[1]);
System.out.println("************************************");
System.out.println("2)");
int a[]= {-20,0,-25,15,19,37,23};

for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
System.out.println(Arrays.toString(a));
System.out.println("Second min value="+a[1]);
	}

}
