package com.basic;

import java.util.Scanner;

public class Squareofnumber {

	public static void main(String[] args) {
	
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the number ");
    int a=sc.nextInt();
    int c=a*a;
    System.out.println("square= "+c);
    sc.close();
	}

}
