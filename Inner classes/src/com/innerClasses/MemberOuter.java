package com.innerClasses;

public class MemberOuter {
  static int a=100;
  int a1=100;
  private int b=10;
  int c=30;
  class Inner {
	  int a=40;
	  //final static variable b=10
	  void display()
	  {
		  System.out.println("Inside member inner class");
		  System.out.println(a+" "+b+" "+c);
		  System.out.println(MemberOuter.this.a1);
	  }
  }
  public static void main(String[] args) {
	
}
  
}
