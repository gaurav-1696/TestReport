package com.string;

public class WordCountString {

	public static void main(String[] args) {
		
  String s1="Java is a programming Language";
  String str[]=s1.split(" ");
  for(String s:str)
  {
	  System.out.println(s);
  }
  System.out.println("total no of words: "+str.length);
  char ch[]=s1.toCharArray();
  String s=" ";
  for(int i=0;i<ch.length;i++)
	
  {
	  if(ch[i]=='g')
	  {
		  ch[i]='G';
	  }
	  s=s+ch[i];
  }
  System.out.println(s);
	}

}
