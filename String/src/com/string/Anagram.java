package com.string;

public class Anagram {

	public static void main(String[] args) {
		String s1="Apple";
		String s2="ppAle";
		char str1[]=s1.toCharArray();
		char str2[]=s2.toCharArray();
		
			for(int i=0;i<str1.length;i++)
			{
				for(int j=i+1;j<str1.length;j++)
				{
					if(str1[i]>str1[j])
					{
						char temp=str1[i];
						str1[i]=str1[j];
						str1[j]=temp;
					}
					
				}
				System.out.print(str1[i]+" ");
			}
			System.out.println();
			for(int i=0;i<str2.length;i++)
			{
				for(int j=i+1;j<str2.length;j++)
				{
					
					if(str2[i]>str2[j])
					{
						char temp=str2[i];
						str2[i]=str2[j];
						str2[j]=temp;
					}
				}
				System.out.print(str2[i]+" ");
				System.out.println();
				int cnt=0;
				if(str1.length==str2.length)
				{
					for(i=0;i<str1.length;i++)
					{
						if(str1[i]==str2[i])
						{
							cnt++;
						}
					}
					if(cnt==str1.length)
					{
						System.out.println("given string is anagram");
					}
					else
					{
						System.out.println("given String is not anagram");
					}
				}
					else
					{
						System.out.println("not a anagram");
					}
				}
			}
		}