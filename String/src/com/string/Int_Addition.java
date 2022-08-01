package com.string;

public class Int_Addition {

	public static void main(String[] args) {
String s="a5s5d6ddxs4";
char ch[]=s.toCharArray();
	int sum=0;
for(int i=48;i<=57;i++)
{	
for(int j=0;j<ch.length;j++)
{
	if(i==ch[j])
	{
		sum=sum+(i-48);
	}
}
	}
System.out.println(sum);
}
}