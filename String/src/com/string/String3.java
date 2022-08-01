package com.string;

public class String3 {
public static void main(String[] args) {
	String s1="Hello";
	String s2="Bye";
	String s3="Hi";
	char str1[]=s1.toCharArray();
	char str2[]=s2.toCharArray();
	char str3[]=s3.toCharArray();
	int j=0;
	int k=0;
	for(int i=0;i<str1.length;i++)
	{
		System.out.print(str1[i]);
		if(j<str2.length)
		{
			System.out.print(str2[j]);
			j++;
		}
		if(k<str3.length)
		{
			System.out.print(str3[k]);
			k++;
		}
		System.out.println();
	}
}
}
