package com.string;
import java.util.Arrays;
public class StringPreDefinedMethod {
 public static void main(String[] args) {
	String s1="  Java  ";//literals
	String s2="Languagesag";
	//String s3="Java";
	String s4=new String ("Java");
	String s5="java";
	String s6=new String("Java");
	System.out.println(s1+"/"+s1.trim() );
	System.out.println(s4==s6);
	System.out.println(s1.equals(s6));
	System.out.println(s1.equalsIgnoreCase(s5));
	System.out.println(s1+s2);
	System.out.println(s1.concat(s2));
	System.out.println(s1.compareTo(s2));//java language
	//s1>s2 + ascii(s1)-ascii(s2)
	//s1<s2 -ve ascii(s1)-ascii(s2)
	//s1==s2 0  ascii(s1)-ascii(s2)
	System.out.println(s1.compareToIgnoreCase(s2));
	System.out.println("length "+s1.length());
	System.out.println("CharAt: "+s1.charAt(2));
	System.out.println("IndexOf: "+s2.indexOf("ag")+" "+s2.indexOf('g', 4));
	System.out.println("LastIndexOf "+s2.lastIndexOf("ag"));
	System.out.println("Startswith: "+s2.startsWith("L"));
	System.out.println("endswith: "+s2.endsWith("sag"));
	System.out.println(s2);
	System.out.println(s2.replace("L", "La"));
	System.out.println("substring: "+s2.substring(4, 9));
	System.out.println(s2.isEmpty());
	System.out.println(s2.toLowerCase());
	System.out.println(s2.toUpperCase());
	char ch[]=s2.toCharArray();
	System.out.println(Arrays.toString(ch));
	String ss="Java is a programming language";
	String str[]=ss.split(" ");
	System.out.println(Arrays.toString(str));
	
}
}
