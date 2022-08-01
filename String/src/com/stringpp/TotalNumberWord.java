package com.stringpp;

public class TotalNumberWord {

	public static void main(String[] args) {
		String s1 = "My Name is Gaurav";
		String s[] = s1.split(" ");
		int cnt = 0;

		for (int i = 0; i < s.length; i++) 
		{
			cnt++;
		}
		System.out.println("Total word count is:" + cnt);
		String a="Apple is good for health";
		String str[]=a.split(" ");
		int count =0;
		for(int i=0;i<str.length;i++)
		{
			count++;
		}
		System.out.println("Total no of words= "+count);
	}

}
