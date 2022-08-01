package com.While;

import java.util.Scanner;

public class largestdigit {

	public static void main(String[] args) {
		
    int num,larger=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    num=sc.nextInt();
    while(num!=0)
    {
    	int r=num%10;
    	if(larger<r)
    	{
    		larger=r;
    		
    	}
    	num=num/10;
    }
    System.out.println(larger);
    sc.close();
    }

}
