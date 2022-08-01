package com.stringpp;

public class CharacterExtraction {

	public static void main(String[] args) {
	// 1)charAt() Method:
		// public  char charAt(int index);
  String s="Java is Danger for health";
  System.out.println(s.charAt(3));
  System.out.println(s.charAt(10));
  System.out.println(s.charAt(15 ));
  // creating String objects using literals
  
  String s1="abc";
  String s2="abc";
  System.out.println(s1==s2);
  //creating string objects using new operator
  String s3=new String ("abc");
  String s4= new String("abc");
  System.out.println(s3==s4 );
	}

}
