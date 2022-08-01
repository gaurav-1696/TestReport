package com.collection;

import java.util.ArrayList;

public class ArrayListMethod {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	ArrayList<Integer> list=new ArrayList<>();
	
	al.add(10);
	al.add(50);
	al.add(50);
	al.add(20);
	al.add(70);
	System.out.println(al);
	al.add(3,100);
	System.out.println(al);
	al.remove(3);   //index as input
	System.out.println(al);
	
	al.clear();
	System.out.println(al);
	
	System.out.println(al.get(4));
	System.out.println(al.isEmpty());
	System.out.println(al.indexOf(10)+" "+al.lastIndexOf(20));
	System.out.println(al.contains(500));
	
	System.out.println(al.set(2, 200));
	System.out.println(al);
	
	list.add(1000);
	list.add(2000);
	list.add(3000);
	
	al.addAll(1,list);
	System.out.println(al);
	
	/*al.removeAll(list);   //remove common element also
	System.out.println(al);*/
	
	al.retainAll(list);
	 System.out.println(al);
	 System.out.println(al.containsAll(list));
	
	 ArrayList<Integer> list1=new ArrayList<>(); 
	 list1.add(100);
	 list1.add(2000);
	 list1.add(3000); 
	
}
}
