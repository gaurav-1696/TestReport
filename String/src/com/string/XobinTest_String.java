package com.string;

import java.util.Scanner;

public class XobinTest_String {
public static void main(String[] args) {
	String s="Java is a programming language ";
	int count=0;
	char z[]=s.toCharArray();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the character");
	char ch=sc.next().charAt(0);
	for(int i=0;i<z.length;i++)
			{
		if(z[i]==ch)
		{
			count++;
		}
	}
	System.out.print(count);
	sc.close();
}
}
