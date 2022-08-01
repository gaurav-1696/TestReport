package com.stringpp;

public class PrintTheIndex {

	public static void main(String[] args) {
		String s="INDIA IS MY COUNTRY AND HINDUSTHAN";
		char ch[]=s.toCharArray();
		for(char i='A';i<'Z';i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(i==ch[j])
				{
					System.out.println(i+" "+j);
				}
			}
		}
	}

}
