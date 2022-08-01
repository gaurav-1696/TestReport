package com.collection;
import java.util.ArrayList;
public class StudentArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Student> al=new ArrayList<>();
 // Student s1=new Student(101,"Raj","ENTC",65);
   
  
	  al.add(new Student(101,"Ramkrushna","ENTC",95)); 
	  al.add(new Student(101,"Ragunath","computer",89));
	  al.add(new Student(101,"Rajesh","ENTC",80));
	  al.add(new Student(101,"Rajendra","mechanical",70)); 
	  al.add(new Student(101,"Bahubali","Mahishmati",100));
	 
  for(Student s:al)
  {
	  if(s.dept.equalsIgnoreCase("computer" ) && s.mark>=60)
	  {
		  System.out.println(s);
	  }
  }
  
	}

}
