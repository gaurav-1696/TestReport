package com.string;

public class Occurance {
	public static void main(String[] args) {
   String s="java is a programming language";
   
   char ch[]=s.toCharArray();
   for(int i=0;i<s.length();i++)
   {
	   int cnt=1;
	   for(int j=i+1;j<s.length();j++)
	   {
		   if(ch[i]==ch[j])
		   {
			   cnt++;
			   ch[j]='#';
		   }
	   }
	   if(ch[i]!='#')
	   System.out.println(ch[i]+" "+cnt);
   }
   }
}