package practise;

import java.util.Scanner;

public class Student {
  int id,marks;
  String name,dpt;
  void setData(int i,String n,String d,int m)
  {
	  id=i;
	  name=n;
	  dpt=d;
	  marks=m;
  }
  void display()
  {
	  System.out.println(id+" "+name+" "+dpt+" "+marks);
  }
  public static void main(String[] args) {
	  Scanner c=new Scanner(System.in);
	  System.out.println("enter the id,name,dpt,marks");
	  int id=c.nextInt();
	  String name=c.next();
	  String dpt=c.next();
	  int marks=c.nextInt();
	  
	Student s=new Student();
	
	s.setData(id, name, dpt, marks);
	
	//s.setData(10, "gaurav", "physics", 85);
	s.display();
	c.close();
}
}
