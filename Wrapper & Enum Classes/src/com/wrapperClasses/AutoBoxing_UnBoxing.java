package com.wrapperClasses;

public class AutoBoxing_UnBoxing {
//java program to convert into objects
	//AutoBoxing example of int to Integer
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//converting int into Integer
		int a=20;
		Integer i=Integer.valueOf(a);  //converting int into Integer explicitly
		Integer j=a;
		System.out.println(a+" "+i+" "+j);
		
		System.out.println("********************************");
		//converting Integer to int
		Integer b=new Integer(3);
		int x=b.intValue();
		int y=b;
		System.out.println(b+" "+x+" "+y);
		
	}
	
	}


