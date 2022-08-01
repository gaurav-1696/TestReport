package com.stringpp;

import java.util.Scanner;

public class ParticularCharCount {

	public static void main(String[] args) {
		String s="Java is a language";
		String d=s.toLowerCase();
		char ch[]=d.toCharArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char a=sc.next().charAt(0);
		int cnt=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==a)
			{
				cnt++;
			}
		}
		System.out.println(cnt);
		//System.out.println(s.length());
		sc.close();
	} 
}