package com.string;

public class StringDouble {
	public static void main(String[] args) {
		String s = " Good bye world bye world miss you hate you miss";
		String ch[]=s.split(" ");  //it is used for split the word from string 
		//char ch[] = s.toCharArray(); it is used for  to separate character
		for (int i = 0; i < ch.length; i++)
		{     
		//	int cnt=0;
			for (int j = i + 1; j < ch.length; j++)
			{
				if (ch[i].equals(ch[j]) )
				{
					//cnt++;
					System.out.print(ch[i] + " ");
				}
			}
			/*
			 * if(cnt>0) { System.out.print(ch[i]+" "); }
			 */
		}
	}
}
