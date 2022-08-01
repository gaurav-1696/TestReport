package arraypractise2;

import java.util.Scanner;

public class CheckElementPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
   int arr[]= {1,2,3,4,5,6,7,8,9,10};
   System.out.println("enter the number");
   int num=sc.nextInt();
   int i = 0;
	
	   if(arr[i]==num)
	   {
		   System.out.println("given number is present");
	   }
	   else
	   {
		   System.out.println("given number is not present");
	   }
	   sc.close();
   }
 
	}


