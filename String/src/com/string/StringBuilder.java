package com.string;

public class StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  StringBuffer sbf=new StringBuffer("Java");
  sbf.append("Langauage");
  System.out.println(sbf);
  String s=new String("Java");
  s.concat("Langauge");
  System.out.println(s);
  
  sbf.reverse();
  System.out.println(sbf);
  System.out.println(sbf.capacity());
  System.out.println(sbf.length());
  
  sbf.replace(5, 8, "Lan");
  System.out.println(sbf);
  
  sbf.delete(5,8);
  System.out.println(sbf);
  sbf.deleteCharAt(5);
  System.out.println(sbf);
  System.out.println(sbf.indexOf("av"));
  
  sbf.insert(5, "Lang");
  System.out.println(sbf);
  
  sbf.insert(6, 3.5f);
  System.out.println(sbf);

	}

}
