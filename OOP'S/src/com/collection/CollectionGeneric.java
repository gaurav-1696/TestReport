package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionGeneric {
public static void main(String[] args) {
	ArrayList <Integer> a= new ArrayList<>();
	a.add(10);
	a.add(50);
	a.add(20);
	a.add(30);
	a.add(10);
	a.add(50);
	a.add(30);
	a.add(20);
	int cnt=0;
	System.out.println(a);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int s=sc.nextInt();
	for(int i=0;i<a.size();i++)
			
	{
		if(a.get(i)==s)
		{	
			cnt++;
	}		
}
	System.out.println(cnt);
sc.close();
}}
