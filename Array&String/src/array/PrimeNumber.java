package array;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
	  int size=10;
	  int a[]=new int[10];
	  Scanner sc=new Scanner(System.in);
	 System.out.println("enter the array element");
	 for(int i=0;i<size;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 for(int i=0;i<size;i++)
	 {  
		 boolean primeno=true;
		 
		 for(int j=2;j<a[i];j++)
		 {
			 if(a[i]%j==0)
			 {
				 primeno=false;
				 break;
			 }
		 }		
		 if(primeno==true && a[i]!=1)
		 {
			 System.out.println("prime number is "+a[i]);
		
		 }
		
	 }
	 sc.close();
	 }
  
}
