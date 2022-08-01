package com.stringpp;

public class HelloByeHi {
public static void main(String[] args) {
	String s1="Hello";
	String s2="Bye";
	String s3="hi";
	
	char ch1[]=s1.toCharArray();
	char ch2[]=s2.toCharArray();
	char ch3[]=s3.toCharArray();
	int j=0,k=0;
	for(int i=0;i<ch1.length;i++)
	{
		System.out.println(ch1[i]);
		if(j<ch2.length)
		{
			System.out.println(ch2[j]);
			j++;
		}
		if(k<ch3.length)
		{
			System.out.println(ch3[k]);
			k++;
		}
		System.out.println();
	}
}
}
