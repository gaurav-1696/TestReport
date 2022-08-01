package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
public static void main(String[] args) {
	LinkedList<Integer> ll=new LinkedList<>();
	ll.add(10);
	ll.add(30);
	ll.add(40);
	ll.add(20);
	ll.add(50);
	ll.add(10);
	ll.add(50);
	ll.add(60);
	ll.add(20);
	ll.add(30);
	Iterator<Integer> itr=ll.descendingIterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
}
}
