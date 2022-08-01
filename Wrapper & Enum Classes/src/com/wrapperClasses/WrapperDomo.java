package com.wrapperClasses;

public class WrapperDomo {
public static void main(String[] args) {
	int a=20;
	Integer i1=new Integer(a);  //boxing
	Integer i2=a;  //autoboxing
	Integer it=100;
	System.out.println(i1==i2);         //memory location
	System.out.println(i1.equals(i1));
	int i=it.intValue();  //unboxing
	int a1=it;     //auto unboxing

	Float f=new Float(200.5f);
	float f1=f;   //respective primitive data type
	short s=f.shortValue();
	long l=f.longValue();
	int b=f.intValue();
	byte b1=f.byteValue();
	double d=f.doubleValue();
}
}
