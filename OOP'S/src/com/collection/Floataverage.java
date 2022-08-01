package com.collection;
import java.util.ArrayList;
public class Floataverage {
public static void main(String[] args) {
	ArrayList<Float> a=new ArrayList<>();
	a.add(56.0f);
	a.add(89.0f);
	a.add(75.0f);
	a.add(65.0f);
	a.add(80.0f);
	System.out.println(a);
	float sum=0;
	for(int i=0;i<a.size();i++)
	{
		 sum=sum+a.get(i);
	}
	float avg=sum/5;
	System.out.println("average ="+avg);
}
}
