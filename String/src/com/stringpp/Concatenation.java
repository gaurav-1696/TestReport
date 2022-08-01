package com.stringpp;

public class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s1="My name is Gaurav";
  String s2="JAVA"+" IS"+" OOPS"+" LANGUAGE";
  System.out.println(s2);
  //creating five String objects
  String s3=new String("Dominar");
  String s4=new String("Burger");
  String s5=new String ("pizza");
  System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5);
  //using predefined method
  System.out.println("using predefined method "+s1.concat(s2));
  int i=1000;
  String d="Java"+i;
  System.out.println(d);
  double r=523.69d;
 System.out.println(r);
  char c='A';
  String g="JAVA"+c;
  System.out.println(g);
  
  boolean t=true;
  String h="JAVA"+t;
  System.out.println(h);
 
	}

}
