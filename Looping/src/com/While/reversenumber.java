package com.While;

import java.util.Scanner;

public class reversenumber {
public static void main(String[] args) {
	int num,rev=0;

	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number: ");
     num=sc.nextInt();
     while (num!=0)                          // while(num!=0)
     {                                         // { int r=num%10;
    	 int r=num%10;                           //  rev=rev*10 +r;
    	 rev=rev*10+r;                             //    num=num/10;
    	 num=num/10;                    // System.out.println(rev);
     }
   
     System.out.println("reverse no: "+rev);
     sc.close();
}
}
