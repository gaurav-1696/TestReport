package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayUserInput {
public static void main(String[] args) {
	 ArrayList<Student> al=new ArrayList<>();
	
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number of student");
	    int num=sc.nextInt();
	    for(int i=0;i<num;i++)
	    {
	    	System.out.println("enter the id,name,dept,marks");
	    	int id=sc.nextInt();
	    	String name=sc.next();
	    	String dept=sc.next();
	    	int mark=sc.nextInt();
	    	al.add(new Student(id,name,dept,mark));
	    }
	    System.out.println(al);
		 
		  for(Student s:al)
		  {
			  if(s.dept.equalsIgnoreCase("computer" ) && s.mark>=60)
			  {
				  System.out.println(s);
			  }
}
		  sc.close();
}
}
