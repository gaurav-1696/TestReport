package com.collection;

import java.util.ArrayList;

public class CollectionNonGeneric {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(40);
	a.add(2.5f);
	a.add("Raj");
	a.add(60);
	a.add(30);
	a.add("gaurav");
	a.add(78.5f);
	//a.add(new Object());
	System.out.println(a);
	for(Object o:a)
	{
		String s=o.getClass().getName();
		if(s.equalsIgnoreCase("java.lang.float"));
		System.out.println(o);
	}
}
}
