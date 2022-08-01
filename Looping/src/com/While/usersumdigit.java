package com.While;

import java.util.Scanner;

public class usersumdigit {

	public static void main(String[] args) {
     int num,sum=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number: ");
     num=sc.nextInt();
     while (num!=0)
     {
    	 int r=num%10;
    	 sum=sum+r;
    	 num=num/10;
    	 
    	 
     }
     System.out.println("Addition is: "+sum);
     sc.close();
	}

}
