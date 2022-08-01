package arrayPractise;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the size");
  int size=sc.nextInt();
  System.out.println("enter the array elemnts");
  int a[]=new int [size];
  for(int i=0;i<size;i++)
  {
	  a[i]=sc.nextInt();
  }
  int sum=0;
  for(int i=0;i<size;i++)
  {
	  sum=sum+a[i];
	    }
  System.out.println("Sum of array="+sum);
sc.close();
}
	
}