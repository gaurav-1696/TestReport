package com.string;

public class ReverseString1 {
	public static void main(String...a) {
        // int a=90;
		String s = "Java is a programming language";
	//  String str[]=s.split(" ");
		char str[]=s.toCharArray();
		for (int i =str.length - 1; i >= 0; i--)
		{
			System.out.print(str[i]+" ");
		}
		
		char st[]=s.toCharArray();
		char c='a';
		int cnt=0;
		for(int i=0;i<st.length;i++)
		{
			if(st[i]==c)
			{
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}
