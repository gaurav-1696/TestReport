package arrayPractise;

import java.util.Arrays;
import java.util.Scanner;

public class A1A5_InputSumProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println( "enter the array size");
    int size=sc.nextInt();
    System.out.println("enter the array element");
    int arr[]=new int[size];
    for(int i=0;i<size;i++)
    {
    	arr[i]=sc.nextInt();
    }
    int sum=0,product=1;
    for(int i=0;i<size;i++)
    {
    	sum=sum+arr[i];
    	product=product*arr[i];
    	
    }
    System.out.println("arr="+Arrays.toString(arr));
    System.out.println("Addition of a given array is "+sum);
    System.out.println("multiplication of a given array is "+product);
sc.close();   
	}

}
