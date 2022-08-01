package com.collection;
import java.util.*;
public class ArrayListDivby3 {
public static void main(String []args){
	ArrayList<Integer> list=new ArrayList<>();
	list.add(9);
	list.add(6);
	list.add(4);
	list.add(2);
	list.add(10);
	list.add(12);
	System.out.println(list);
	
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i)%3==0)
		{
			System.out.println(list.get(i));
		}
	}
	
}
}
