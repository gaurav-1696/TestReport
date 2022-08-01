package arrayHW;

import java.util.Scanner;

public class reverseorder {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int number[]=new int[10];
	System.out.println("enter the numbers:");
	for(int i=0;i<10;i++)
	{
		number[i]=sc.nextInt();
	}
	System.out.println("array in vererse order is: ");
	for(int i=9;i>=0;i--)
	{
		System.out.print(number[i]+" ");
	}
	sc.close();
}
}