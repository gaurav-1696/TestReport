package com.string;

import java.util.Arrays;

public class Anagram2 {
	public static void main(String[] args) {	
	String s1="Apple";
	String s2="ppAle";
	char str1[]=s1.toCharArray();
	char str2[]=s2.toCharArray();
	
	if(s1.length()==s2.length())
	{

		Arrays.sort(str1);
		Arrays.sort(str2);

		if(Arrays.equals(str1,str2))
		{
			System.out.println("Given String is anagram");
		}
	}
	else
	{
		System.out.println("given string is not Anagram");
	}
}
}
