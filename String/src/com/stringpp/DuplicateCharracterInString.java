package com.stringpp;

public class DuplicateCharracterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String s="Java is a language";
		  char ch[]=s.toCharArray(); 
		  for(int i=0;i<ch.length;i++) 
		  {
			  for(int j=i+1;j<ch.length;j++) 
			  {
				  if(ch[i]==ch[j])
				  {
		  System.out.print(ch[j]+" "); 
		  }
				  } 
			  }
		 
		/*String s1="I am Leaving in";
		
		char s[]=s1.toCharArray();
		
		System.out.println("Duplicate character in given String:");
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]==s[j]) {
					System.out.print(s[j]+" ");
				}
			}
		}*/
	}

}
