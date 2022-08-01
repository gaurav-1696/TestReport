package com.wrapperClasses;

public class WrapperConstructor {
public static void main(String[] args) {
	Integer i1=new Integer(20);
	Integer i2=new Integer("20");
	
	Character c1=new Character('s');
	
	Float f1=new Float(3.5f);
	Float f2=new Float(3.5);
	Float f3=new Float("3.5");
	
	Integer it1=Integer.valueOf(20);
	Integer it2=Integer.valueOf("20");
	System.out.println(it2);
	Integer it3=Integer.valueOf("123", 4);   //1*4^2 + 2*4^1 + 3*4^0 =27
	System.out.println(it3);
	int i=Integer.parseInt("30");
	float f=Float.parseFloat("30.5");
	System.out.println(f);
}
	
}
