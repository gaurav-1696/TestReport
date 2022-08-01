package com.stringpp;

import java.util.Arrays;


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Java is a language";
String str[]=s.split(" ");
for(int i=str.length-1;i>=0;i--)
{
	System.out.print(str[i]+" ");
}
System.out.println(Arrays.toString(str));
System.out.println();

	}

}
