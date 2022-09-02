package com.string;

public class RemoveOccurance {

	public static void main(String[] args) {
		
		
		  String s="java is a programming language"; 
		  char ch[]=s.toCharArray(); 
		  int length=s.length(); 
		  String remo=" "; 
		  for(int i=0;i<length;i++) 
		  {
		  if(ch[i]!=' ') 
		  { 
			  remo=remo+ch[i];
		  } 
		  }
		  System.out.println(remo);		
	}
}
