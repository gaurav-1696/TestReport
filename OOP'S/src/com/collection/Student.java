package com.collection;

import java.util.ArrayList;

public class Student {
int id;
int mark;
String name,dept;
Student(int id,String name,String dept,int mark)
{
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.mark=mark;
	
}
public String toString()
{
	return id+" "+name+" "+dept+" "+mark;
}
}
