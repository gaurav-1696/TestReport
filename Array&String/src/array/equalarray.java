package array;

import java.util.Scanner;

public class equalarray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=6;
	
	int a[]=new int[size];
	int b[]=new int[size];
	System.out.println("enter "+size+" elements");
         for(int i=0;i<size;i++)
         {
        	 a[i]=sc.nextInt();
         }
         System.out.println("enter "+size+" elements");
         for(int i=0;i<size;i++)
         {
        	 b[i]=sc.nextInt();
         }
         System.out.println();
         for(int i=0;i<size;i++)
         {
        	 
        	 if(a[i]==b[i])
        	 {
        		 System.out.println("Equal arrays");
        	 }
        	 else
        		 System.out.println("Not equal arrays");
         }
   sc.close();
}
}
