package array;

import java.util.Scanner;

public class PairOfSum {

	public static void main(String[] args) {
		
  int arr[]= {4,8,7,6,5,3,-2,10,14};
  Scanner sc=new Scanner(System.in);
  System.out.println("enter any no");
  int sum=sc.nextInt();
 
  for(int i=0;i<arr.length;i++)
  {
	  for(int j=i+1;j<arr.length;j++)
	  {
		  if(arr[i]+arr[j]==sum)
		  {
			  System.out.println(arr[i]+" "+arr[j]);
		  }
	  }
  }
  sc.close();
	}

}
