package com.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class FailPassIterator {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<>();
	a.add(10);
	a.add(50);
	a.add(20);
	a.add(30);
	a.add(10);
	a.add(50);
	a.add(30);
	a.add(20);
	System.out.println(a);
	/*
	 * for(int i=0;i<a.size();i++) { if(a.get(i)==20) { a.remove(i); a.add(200); } }
	 * System.out.println(a);
	 */
	ListIterator<Integer> litr=a.listIterator();
	while(litr.hasNext())
	{
		if(litr.next()==20)
			litr.remove();   //listiteratot
	}
}
}
