package com.stringpp;

import java.util.Arrays;

//import java.util.Scanner;

public class String1 {
public static void main(String[] args) {
// Taking input
//	Scanner sc=new Scanner(System.in);
//	String name=sc.nextLine();
	
	//Declaration
	String name="Tony";
	String lastName="Stark";
	String name2="thor";
	
	//concatenation
	String fullName=name+" "+lastName;
	System.out.println("fullName: "+fullName);
	System.out.println(name.concat(lastName));
	
	//print length of a String
	System.out.println("length of a String: "+fullName.length());
	
	//Access character of a String
	for(int i=0;i<fullName.length();i++)
	{
		System.out.print(fullName.charAt(i)+" ");
	}
	
	//Comparing to String
	System.out.println();
	
	
	  if(name.equals(name2)) { 
		  System.out.println("strings are equal");
		  }
	  else
	  {
		  System.out.println("String are not equals  ");
	  }
	 
	System.out.println(name.compareTo(name2));
	
	// lower case into upper case
	System.out.println(name.toUpperCase());
	System.out.println(name2.toUpperCase());
	// upper case into lower case
	System.out.println(name.toLowerCase());
	System.out.println(name2.toLowerCase());
	
	//splitting
	 String str[]=fullName.split(" ");
	 System.out.println(Arrays.toString(str));
}
}
