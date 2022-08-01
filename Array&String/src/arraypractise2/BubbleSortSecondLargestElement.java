package arraypractise2;

import java.util.Arrays;

public class BubbleSortSecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr[]= {1,2,3,4,5,6,7,8,9,10};
  System.out.println("using bubble sorting");
  for(int i=0;i<arr.length;i++)
  {
	  for(int j=i+1;j<arr.length;j++)
	  {
		  if(arr[i]<arr[j])   //bubble sort
		  {
			  int temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
		  }
	  }
  }
  System.out.println(Arrays.toString(arr));
  System.out.println("Second Largest Digit "+arr[1]);
  System.out.println("*********************************");
  //Quick sort
  System.out.println("using Quick sort ");
  for(int i=0;i<arr.length;i++)
  {
	  for(int j=i+1;j<arr.length-1;j++)
	  {
		  if(arr[i]<arr[j+1])
		  {
			  int temp=arr[i];
			  arr[i]=arr[j+1];
			  arr[j+1]=temp;
		  }
	  }
  }
  System.out.println(Arrays.toString(arr));
  System.out.println("Second LArgest digit "+arr[1]);
	}

}
