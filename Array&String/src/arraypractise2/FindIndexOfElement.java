package arraypractise2;

import java.util.Scanner;

public class FindIndexOfElement {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
  int arr[]= {1,2,3,4,5,6,7,8,9,10};
  System.out.println("enter the element");
  int d=sc.nextInt();
  for(int i=0;i<arr.length;i++)
  {
	  if(arr[i]==d)
	  {
		  System.out.println("index of a number is " +i);
	  }
  }
		  
	}

}
