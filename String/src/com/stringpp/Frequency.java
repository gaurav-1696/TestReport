package com.stringpp;

import java.util.Scanner;

public class Frequency {
public static void main(String[] args) {
	 String s;
	 Scanner sc=new Scanner(System.in); 
	 System.out.println("enter string=");
	 s=sc.nextLine();
	 
	 System.out.println("Inputed string are = " +s);
	 
	 char[] ch=s.toCharArray();
	 
		/*
		 * for(i=0;i<ch.length;i++) {
		 * 
		 * c=1; for(j=i+1;j<ch.length;j++) { if(ch[i]==ch[j]) { c++; ch[j]='0'; }
		 * 
		 * } if(ch[i]!='0') { System.out.println("\n CHARACTER "+
		 * ch[i]+" OCCURS: "+c+" TIMES"); } }
		 */	 for(int i=0;i<ch.length;i++)
	   {
		    int c=1;
		 for(int j=i+1;j<ch.length;j++)
		 {
			 if(ch[i]==ch[j])
			 {
				 c++;
				 ch[j]='0';
			 }
		 }
		 if(ch[i]!='0')
		 {
			 System.out.println(ch[i]+" "+c);
		 }
	 }
	 sc.close();
}
}
