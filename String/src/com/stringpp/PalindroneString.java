package com.stringpp;

import java.util.Scanner;

public class PalindroneString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String org_str=str;
		String rev=" ";
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
   if(rev.equals(org_str)) {
	   System.out.println("Given String is palindrone ");
   }
   else
   {
	   System.out.println("given String is not palindrome");
   }
   
   sc.close();	}

}
